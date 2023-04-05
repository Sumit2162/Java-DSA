
public class LeaderElemant {
	public static void leaderElemant(int arr[],int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]<arr[j]) {
//					break;
//					arr[i]=arr[j];
					System.out.print(arr[i]+" ");
				}
//				 if(arr[i]>arr[j]) {
//					System.out.println(arr[i]+" ");
//				}
			}
		}
	}

	public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,2};
        int n= arr.length-1;
        leaderElemant(arr, n);
	}

}
