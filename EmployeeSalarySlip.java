import java.util.*;
public class EmployeeSalarySlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		Scanner input = new Scanner(System.in);
		System.out.println("=================Salary Slip=================");
		System.out.print("  Enter user id: ");
		int id = input.nextInt();
		input.nextLine();
		System.out.print("  Enter name: ");
		String name = input.nextLine();
		System.out.print("  Enter basicsalary: ");
		double basicsalary = input.nextDouble();
//		Earnings
		double hra= basicsalary*0.50;
		double da = basicsalary*0.10;
		double ta = basicsalary*0.40;
		double ma = basicsalary*0.30;
		double GrossSalary = basicsalary+hra+da+ta+ma;
		System.out.print("  GrossSalarry: "+GrossSalary+"          ");
//		Deductions
		double pf = 0.05;
		double totalpf = basicsalary*pf;
		System.out.println("  totalpf: "+totalpf);
		double tax=.10;
		double totaltax = GrossSalary*tax;
		System.out.print("  totaltax: "+totaltax+"          ");
		double netsalary = GrossSalary-totalpf-totaltax;
		System.out.println("  netsalary: "+netsalary);
	}

}
