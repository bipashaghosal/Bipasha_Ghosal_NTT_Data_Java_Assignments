package com.assessment;

import java.util.Scanner;

public class Employee {
	
	public static void calculatenetsalary(int basicSalary,int tax){
		double netSalary;
		if(basicSalary<=10000) {
			netSalary = ((0.2*basicSalary)+(0.80*basicSalary)+(0.2*basicSalary)) - tax;
			System.out.println("Net Salary is "+netSalary);
		}
		else if(basicSalary>=10001 && basicSalary<20000) {
			netSalary = ((0.25*basicSalary)+(0.90*basicSalary)+(0.2*basicSalary)) - tax;
			System.out.println("Net Salary is "+netSalary);
		}
		else if(basicSalary>=20001) {
			netSalary = ((0.30*basicSalary)+(0.9*basicSalary)+(0.2*basicSalary)) - tax;
			System.out.println("Net Salary is "+netSalary);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empid, basicSalary;
		int tax=2500;
		String empName;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee name");
		empName = sc.nextLine();
		System.out.println("Enter employee id");
		empid = sc.nextInt();
		System.out.println("Enter employee Basic Salary");
		basicSalary = sc.nextInt();
		System.out.println("Employee name is "+empName+" id is "+empid+" Basic Salary is "+basicSalary);
		calculatenetsalary(basicSalary,tax);
		
	}

}
