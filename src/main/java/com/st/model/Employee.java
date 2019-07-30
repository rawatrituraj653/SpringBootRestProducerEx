package com.st.model;

import java.util.Date;

import lombok.Data;
import lombok.NonNull;

@Data
public class Employee {

	@NonNull
	private Integer empId;
	@NonNull
	private String empName;
	@NonNull
	private Double empSal;
	@NonNull
	private String deptName;
	@NonNull
	private Date  doj;
}
