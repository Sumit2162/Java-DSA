package program;

public class EmpSalarySlip {
     int id;
     String name;
     double basicsalary;
     //Earning
     double hra = 0.13;
     double da = 0.23;
     double ta = 0.34;
     double ma = 0.12;
     //deductions
     double pf = 0.15;
     double tds = 0.06;
     //leave
     double leave = 5;
     public EmpSalarySlip(int id,String name,double basicsalary) {
		// TODO Auto-generated constructor stub
    	 this.id = id;
    	 this.name = name;
    	 this.basicsalary = basicsalary;
	}
     void showEmpdetails() {
    	 System.out.println("ID : " + id);
    	 System.out.println("Name :" +name);
    	 System.out.println("Basicsalary: " +basicsalary);
     }
     public double earnings() {
    	 double earningssalary = basicsalary*hra+basicsalary*da +basicsalary*ta + basicsalary*ma ;
    	 return earningssalary;
     }
     public double deductions() {
    	 double deductionssalary = basicsalary*pf + basicsalary*tds;
    	 return deductionssalary;
     }
     public double netsalary() {
    	 double earningssalary = earnings();
    	 double deductionssalary = deductions();
    	 double netsalary = earningssalary-deductionssalary;
    	 return netsalary;
     }
     public double leavesalary() {
    	 double netsalary = netsalary();
    	 double leavesalary = netsalary/22;
    	 return leavesalary;
     }
     public double totalleavesalary() {
    	 double leavesalary = leavesalary();
    	 double totalleavesalary = leave*leavesalary;
    	 return totalleavesalary;
     }
     public double totalsalary() {
    	 double netsalary = netsalary();
    	 double totalleavesalary = totalleavesalary();
    	 double totalsalary = netsalary-totalleavesalary;
    	 return totalsalary;
     }
}
