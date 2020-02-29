package com.springintroduction.test.SpringIntroduction.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springintroduction.test.SpringIntroduction.config.SpringIntroductionConfig;
import com.springintroduction.test.SpringIntroduction.initializer.EmployeeInitializer;
import com.springintroduction.test.SpringIntroduction.pojo.Employee;


public class MainAppRunner {
	public static void main(String[] args) {
		System.out.println("Started");
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringIntroductionConfig.class);
		EmployeeInitializer empInitializer = context.getBean(EmployeeInitializer.class);
		empInitializer.initEmployee("Sam Bhalladev", "AL02023");
		employeePrinter(empInitializer);
		System.out.println("stopped");
		((AnnotationConfigApplicationContext)context).close();
	}
	
	public static void employeePrinter(EmployeeInitializer empInit) {
		Employee emp = empInit.getEmployee();
		System.out.println("============================Employee General============================");
		System.out.println("Employee Name: " + emp.getEmpName());
		System.out.println("Employee Id: " + emp.getEmpId());
		System.out.println("============================Department Details============================");
		System.out.println("Department Name: " + emp.getDept().getName());
		System.out.println("Department Id: " + emp.getDept().getId());
		System.out.println("============================Address Details============================");
		System.out.println("Address1: " + emp.getAddressInfo().getAddress1());
		System.out.println("City: " + emp.getAddressInfo().getCity());
		System.out.println("Zip code: " + emp.getAddressInfo().getZipCode());
		System.out.println("State: " + emp.getAddressInfo().getState());
		System.out.println("Country: " + emp.getAddressInfo().getCountry());
		System.out.println("============================Salary Details============================");
		System.out.println("Basic: " + emp.getSalaryInfo().getBasic());
		System.out.println("HRA: " + emp.getSalaryInfo().getHra());
		System.out.println("DA: " + emp.getSalaryInfo().getDa());
		System.out.println("PF: " + emp.getSalaryInfo().getPf());
		System.out.println("Food Coupon: " + emp.getSalaryInfo().getFoodCoupon());
		System.out.println("========================================================================");
	}
}
