
public class SecondMax {
	public static void Aproach_2(int arr[],int n) {
		int max=arr[0];
		int secondMax=-1;
		for(int i=1;i<n;i++) {
			if(arr[i]>max) {
				secondMax=max;
				max=arr[i];
			}
			if(arr[i]!=max) {
				if(arr[i]>secondMax) {
					secondMax=arr[i];
				}
			}
		}
		System.out.println("MAX :"+max);
		System.out.println("SECOND MAX:"+secondMax);
 
	}

   public static void main(String[] args) {
	   int arr[]= {10,30,20,5,40,23};
	   int n=arr.length;
		Aproach_2(arr,n);
}
}
