package com.BrainMentors.SalarySlip.Views;

import java.util.Scanner;

import com.BrainMentors.SalarySlip.Model.Employee;

public class EmpView {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee ID");
		int empid = sc.nextInt();
		sc.nextLine();
		System.out.println("enter emp name");
		String empName= sc.nextLine();
		System.out.println("enter salary ");
		double salary = sc.nextDouble();
		Employee sumit =new Employee(empid, empName, salary);
		System.out.println(sumit);
//		System.out.println("Emp Id : " + sumit.getId());
//		System.out.println("Emp Name : " + sumit.getName());
//		System.out.println("Emp Basic Salary : " + sumit.getSalary());
//		System.out.println("Emp Net Payable Salary : " + sumit.netSalary());
	}
}
