package program;

public class HollowPyramidtriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n =7;
for(int i = 1;i<=n;i++) {
	for(int j=n;j>i;j--) {
		System.out.print("  ");
	}
	for(int j=1;j<=2*i-1;j++)
	if(i==n||j==1||j==2*i-1){
		System.out.print("* ");
	}
	else {
		System.out.print("  ");
	}
		System.out.println();
}
	}

}
