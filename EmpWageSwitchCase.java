package com.EmployeeWage;

import java.util.Random;
import java.util.Scanner;

public class EmpWageSwitchCase {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter your choice");

		int option = s.nextInt();

		switch (option) {
		case 1:

			int isfulltime = 8;
			int empsalary = 0;
			int empPerHrs = 20;
			int monthlySalaryfull = 0;

			for (int day = 1; day <= 20; day++) {

				System.out.println("Employee is Full Time");
				empsalary = isfulltime * empPerHrs;

				System.out.println("Salary of employee " + empsalary);
				monthlySalaryfull = monthlySalaryfull + empsalary;
				System.out.println("Monthly full salary " + monthlySalaryfull);
				break;
			}

		case 2:
			int isparttime = 4;
			int empsalary1 = 0;
			int empPerHrs1 = 20;

			System.out.println("Employee is Part Time");
			empsalary1 = isparttime * empPerHrs1;

			System.out.println("Salary of employee " + empsalary1);
			break;
		default:

			System.out.println("Employee is not working");
		}

	}

}
