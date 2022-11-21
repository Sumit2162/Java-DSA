import java.util.*;
public class StudentMarksheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
	        System.out.print(" Student Name: ");
	        String name = sc.nextLine();
	        System.out.print(" Father Name: ");
	        String SFN = sc.nextLine();
	        System.out.print(" Roll No: ");
	        int Rollno = sc.nextInt();
//	        sc.nextLine();
	        System.out.print(" Semester:  ");
	        int sem = sc.nextInt();
            System.out.println("Subject marks: ");
          System.out.print(" DSP: ");
          float DSP = sc.nextFloat();
          System.out.print(" ASD: ");
          float ASD = sc.nextFloat();
          System.out.print(" MP: ");
          float MP = sc.nextFloat();
          System.out.print(" VLSI: ");
          float VLSI = sc.nextFloat();
          System.out.print(" IC: ");
          float IC = sc.nextFloat();
          System.out.print(" COI: ");
          float COI = sc.nextFloat();
       float obtainedmarks = DSP+ASD+COI+MP+IC+VLSI;

       System.out.println("obtainedmarks: "+obtainedmarks);
       int totalmarks = 600;
       System.out.println("totalmarks: "+totalmarks);
        float percentage = obtainedmarks/totalmarks*100f;
//        System.out.println("percentage: "+percentage);
        if(percentage<=100) {
        	System.out.println("percentage: "+percentage);
        }else  {
        	System.out.println("Please Enter valid subject marks...4");
        }
        if(percentage>90&&percentage<=100) {
        	System.out.println("Passed with Grade A ");
        	}
        	else if(percentage>70&&percentage<=90) {
        		System.out.println("passed with Grade B ");
        	}
        	else if(percentage>50&&percentage<=70) {
        		System.out.println("passed with Grade C ");
        	}
        	else if(percentage>30&&percentage<=50) {
        		System.out.println("passed with Grade D ");
        }
        	else if(percentage>=0&&percentage<=30) {
        		System.out.println("Failed ");
	}
        	else {
        		System.out.println("you entered wrong marks ");
        	}
    }
 }
