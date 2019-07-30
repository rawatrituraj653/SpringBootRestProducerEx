package com.st.model;

import java.util.Date;



public class EmployeeBuilder{

	private Integer empId;
	private String empName;
	private Double empSal;
	private String deptName;
	private Date  doj;
	
	public EmployeeBuilder setEmpId(Integer empId) {
		this.empId = empId;
		return this;
	}
	public EmployeeBuilder setEmpName(String empName) {
		this.empName = empName;
		return this;
	}
	public EmployeeBuilder setEmpSal(Double empSal) {
		this.empSal = empSal;
		return this;
	}
	public EmployeeBuilder setDeptName(String deptName) {
		this.deptName = deptName;
		return this;
	}
	public EmployeeBuilder setDoj(Date doj) {
		this.doj = doj;
		return this;
	}
	
	public Employee build() {
		
		return new Employee(empId, empName, empSal, deptName, doj);
	}
	
	
}
