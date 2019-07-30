package com.st.rest.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.st.model.Employee;
import com.st.model.EmployeeBuilder;

@RestController
@RequestMapping("/emp")
public class EmployeeContoller {

	@SuppressWarnings("deprecation")
	@PostMapping("/saveEmp")
	public Employee saveEmployee() {
		
		return new EmployeeBuilder()
				.setEmpId(101)
				.setEmpName("Rituraj")
				.setDeptName("Devloper")
				.setEmpSal(40000.30)
				.setDoj(new Date(2016-1900,11-1, 23))
				.build();
	}
	
	@PostMapping("/allEmp")
	public List<Employee> saveAll(){
		return Arrays.asList(
				new Employee(102, "AMit", 50000.00,"Marketing",new Date()),
				new Employee(103, "Pavan", 34000.00,"Account",new Date()),
				new Employee(104, "PankAj", 23000.00,"Sales",new Date()),
				new Employee(105, "Kumar", 45600.00,"Devlopment",new Date()),
				new Employee(106, "Suraj", 34500.00,"production",new Date()),
				new Employee(107, "Rais", 56770.00,"testing",new Date())
				);
		
	}
		
	@PostMapping("/header")
	public String getAdd(@RequestHeader("hello") String sample) {
		
		
		
		return "Hello get header: "+sample;
	}
	@PostMapping("/body")
	public Employee getdata(@RequestBody  Employee  emp) {
		
		System.out.println("Employee Data is : \n: "+emp);
		return emp; 
	}
	@GetMapping("/param")
	public ResponseEntity<String> getRequestparam(@RequestParam String id,@RequestParam String name){
		return new ResponseEntity<String>("Data From Request Param  id:"+id+": name "+name,HttpStatus.OK);
	}
	
	@GetMapping("/path/{id}/{name}")
	public ResponseEntity<String> getPathparam(@PathVariable String id,@PathVariable String name){
		return new ResponseEntity<String>("Data From Request Param  id:"+id+": name "+name,HttpStatus.OK);
	}
	
}
