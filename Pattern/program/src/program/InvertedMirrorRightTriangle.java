package program;

public class InvertedMirrorRightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=6;
for(int i = 1; i<=n;i++) {
	for(int j =1; j<i;j++) {
		System.out.print("^ ");
	}
	for(int j=n;j>=i;j--) 
	if(i==1||j==i||j==n){
		System.out.print("* ");
	}
	else{
		System.out.print("  ");
	}
		System.out.println();
	}
}
	}


