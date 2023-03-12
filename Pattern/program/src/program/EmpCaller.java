package program;

public class EmpCaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       EmpSalarySlip sumit = new EmpSalarySlip(102,"Sumit tomar jaat",45000);
       sumit.showEmpdetails();
       double netsalary = sumit.netsalary();
       double leavesalary = sumit.leavesalary();
       double totalsalary = sumit.totalsalary();
       System.out.println("net salary is: " +netsalary);
       System.out.println("leave salary is: " +leavesalary);
       System.out.println("total salary is: " +totalsalary);

	}

}
