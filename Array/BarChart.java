
public class BarChart {
	public static void barChart(int arr[]) {
		int max=arr[0];
		for(int element:arr) {
			if(element>max) {
				max=element;
			}
		}
		for(int i=max;i>=1;i--) {
			for(int j=0;j<arr.length;j++) {
			if(i<=arr[j]) {
				System.out.print("*\t");
			}
			else {
				System.out.print("\t");
			}
			}
			System.out.println();
		}
	}
   public static void main(String[] args) {
	int arr[]= {2,1,7,9,0,5};
	barChart(arr);
}
}
