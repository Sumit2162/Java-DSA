
public class LargestElement {
	public static void Aproach_1(int arr[]) {
		int max=0;
		for(int i=0;i<=arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					arr[i]=arr[j];
					max=arr[i];
				}
			}
		}
		System.out.println("max:"+max);
	}
      public static void main(String[] args) {
		int arr[]= {10,30,20,5,40,23};
		Aproach_1(arr);
	}
}
