package com.BrainMentors.SalarySlip.Model;

import com.BrainMentors.SalarySlip.Utils.CommonUtils;

public class Employee {
    private int id;
    private String name;
    private double salary;
    public Employee(int id,String name,double salary) {
    	this.id=id;
    	CommonUtils utils = new CommonUtils();
    	name =utils.formatname(name);
    	this.name=name;
    	this.salary=salary;
    	
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
    
	//Earning
	private double getHRA() {
		return salary * 0.25;
	}
	
	private double getTA() {
		return salary * 0.15;
	}
	
	private double getDA() {
		return salary * 0.30;
	}
	
	private double getMA() {
		return salary * 0.10;
	}
	// Deductions
		private double getTDS() {
			return salary * 0.10;
		}
		private double getPF() {
			return salary * 0.05;
		}
		// Net Salary Calculation
		public double netSalary() {
			double earnings = salary + getHRA() + getTA() + getDA() + getMA();
			double deductions = getTDS() + getPF();
			double netSal = earnings - deductions;
			return netSal;
		}
		@Override
		public String toString() {
			return "Emp ID : " + id + "\n" +
					"Emp Name : " + name + "\n" + 
					"Emp Basic Salary : " + salary + "\n" + 
					"Emp Net Salary : " + netSalary();
		}
}
