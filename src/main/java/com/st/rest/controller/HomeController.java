package com.st.rest.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	
	@GetMapping("/show")
	public String show() {

		return "Today Date is: "+new Date();
	}
	
	@GetMapping("/showA")
	public ResponseEntity<String> showRes(){
		String str="Hello from Response "+LocalDateTime.now();
		return new ResponseEntity<String>(str, HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public String savePost() {
		
		return "This is From Post Mapping"+UUID.randomUUID().toString().replace("-","")
				.substring(1, 20).toUpperCase();
	}

	@PutMapping("/update")
	public String savePut() {
		String sotp=null;
		while (true) {
		int otp=new Random().nextInt(9999999);
		sotp=""+Math.abs(otp);
		if(sotp.length()==6) break;
		}
		return "This is  put Mapping: "+sotp;
	}
	
	@PatchMapping("/updatep")
	public String savePatch() {
		
		return"Today Time from Patch Mapping: "+new Date();
	}
	@DeleteMapping("/delete")
	public String delete() {
		
		return "DELETE FROM PRODUCER BY USING DELETE MAPPING" ;
	}
	
	
}
