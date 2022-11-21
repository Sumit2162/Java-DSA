import java.util.*;
public class DaysPrintInMonths {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
		int year = sc.nextInt();
		System.out.println("Enter month ");
		int month = sc.nextInt();
		if(month==1||month==3||month==5||month==7||month==9||month==11) {
			System.out.println("total 31 days");
		}else if(month==4||month==6||month==8||month==10||month==12) {
			System.out.println("total days 30");
		}else if(month==2) {
			if(year%4==0) {
				System.out.println("total days is 28");
			}
			else {
				System.out.println("total days is 29");
			}
		}
		sc.close();
		}
	}

