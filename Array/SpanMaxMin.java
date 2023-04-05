
public class SpanMaxMin {
	public static void span(int arr[]) {
		int min= Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("SPAN: "+(max-min));
	}
   public static void main(String[] args) {
	int arr[]= {10,20,11,90,9};
	span(arr);
}
}
