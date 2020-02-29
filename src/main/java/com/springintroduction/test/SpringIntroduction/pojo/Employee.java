package com.springintroduction.test.SpringIntroduction.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Employee {
	private String empName;
	private String empId;
	private Department dept;
	private Address addressInfo;
	private SalaryInformation salaryInfo;
	
	public Employee() {
		
	}
	
	public Employee(String empName) {
		this.empName = empName;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Department getDept() {
		return dept;
	}

	@Autowired
	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Address getAddressInfo() {
		return addressInfo;
	}

	@Autowired
	public void setAddressInfo(Address addressInfo) {
		this.addressInfo = addressInfo;
	}

	public SalaryInformation getSalaryInfo() {
		return salaryInfo;
	}

	@Autowired
	public void setSalaryInfo(SalaryInformation salaryInfo) {
		this.salaryInfo = salaryInfo;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", dept=" + dept + ", addressInfo=" + addressInfo
				+ ", salaryInfo=" + salaryInfo + "]";
	}
}
