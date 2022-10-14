package com.EmployeeWage;

import java.util.Random;

public class EmpIsPartTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int isparttime = 4;
		int empPerHrs = 20;

		Random rn = new Random();

		int emp = rn.nextInt(1);
		int empsalary = 0;

		if (emp == 0) {
			System.out.println("Employee is Part Time");
			empsalary = isparttime * empPerHrs;

			System.out.println("Salary of employee " + empsalary);

		} else {

			System.out.println("Employee is Full Time");
		}
	}

}