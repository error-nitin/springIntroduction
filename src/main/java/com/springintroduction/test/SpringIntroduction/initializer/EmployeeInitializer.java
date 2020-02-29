package com.springintroduction.test.SpringIntroduction.initializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springintroduction.test.SpringIntroduction.pojo.Address;
import com.springintroduction.test.SpringIntroduction.pojo.Department;
import com.springintroduction.test.SpringIntroduction.pojo.Employee;
import com.springintroduction.test.SpringIntroduction.pojo.SalaryInformation;

@Component(value="employeeInitialize")
public class EmployeeInitializer {
	private Employee employee;
	
	public Employee getEmployee() {
		return this.employee;
	}
	
	@Autowired
	public EmployeeInitializer(Employee employee) {
		this.employee = employee;
	}
	
	public void initEmployee(String name, String id) {
		employee.setEmpName(name);
		employee.setEmpId(id);
		this.initAddress(employee.getAddressInfo());
		this.initDepartment(employee.getDept());
		this.initSalary(employee.getSalaryInfo());
	}
	public void initAddress(Address address) {
		address.setAddress1("Somewhere on the planet");
		address.setCity("Some city");
		address.setState("state");
		address.setCountry("India");
		address.setZipCode(1233456);		
	}
	
	public void initDepartment(Department department) {
		department.setId(102);
		department.setName("Engineering");
	}
	
	public  void initSalary(SalaryInformation salary) {
		salary.setBasic(12000.000f);
		salary.setDa(salary.getBasic()*0.45f);
		salary.setFoodCoupon(1200);
		salary.setHra(0.12f*salary.getBasic());
		salary.setPf(0.10f*salary.getBasic());
	}
	
	@Override
	public String toString() {
		return employee.toString();
	}
}
