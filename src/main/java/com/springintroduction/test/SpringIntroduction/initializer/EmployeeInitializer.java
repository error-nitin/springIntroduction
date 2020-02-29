package com.springintroduction.test.SpringIntroduction.initializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.springintroduction.test.SpringIntroduction.pojo.Address;
import com.springintroduction.test.SpringIntroduction.pojo.Department;
import com.springintroduction.test.SpringIntroduction.pojo.Employee;
import com.springintroduction.test.SpringIntroduction.pojo.SalaryInformation;

/**
 * Class to initialize employee object.
 * This class can be use to provide default employee behavior.
 * @author error.nitin
 *
 */
@Component(value="employeeInitialize")
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class EmployeeInitializer {
	private Employee employee;
	
	/**
	 * Method to get an {@link Employee} object.
	 * @return {@link Employee}
	 */
	public Employee getEmployee() {
		return this.employee;
	}
	
	@Autowired
	public EmployeeInitializer(Employee employee) {
		this.employee = employee;
	}
	
	/**
	 * Method to initailize employee object with name and id
	 * @param name - employee name
	 * @param id - employee id
	 */
	public void initEmployee(String name, String id) {
		employee.setEmpName(name);
		employee.setEmpId(id);
		this.initAddress(employee.getAddressInfo());
		this.initDepartment(employee.getDept());
		this.initSalary(employee.getSalaryInfo());
	}
	
	/**
	 * Method to initialize employee address
	 * @param address - {@link Address}
	 */
	public void initAddress(Address address) {
		address.setAddress1("Somewhere on the planet");
		address.setCity("Some city");
		address.setState("state");
		address.setCountry("India");
		address.setZipCode(1233456);		
	}
	
	/**
	 * Method to initialize {@link Department} of the employee
	 * @param department {@link Department}
	 */
	public void initDepartment(Department department) {
		department.setId(102);
		department.setName("Engineering");
	}
	
	/**
	 * Method to initialize employee salary
	 * @param salary {@link SalaryInformation}
	 */
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
