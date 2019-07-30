package com.st.model;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/com")
public class CommunicationController {

	@GetMapping("/data")
	public ResponseEntity<String> getdata(){
		
		Date date=new Date();
		String str="Data Comes from Producer App:  "+date;
		ResponseEntity<String> res=new ResponseEntity<String>(str,HttpStatus.OK);
		return res;
	}
}
