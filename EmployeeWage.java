package com.EmployeeWage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome EmployeeWage Computation program");
		
		Random rn = new Random();
		
		int emp = rn.nextInt(2);
		
		if(emp == 0){
		 System.out.println("Employee is Present");
		 
		}
		else if(emp == 1){
			
			System.out.println("Employee is Absent");
		}
		else{
		System.out.println("Employee is not working");
			
		}
		}
	

	}
