
public class DuplicateRitik {
	public static void Array(int arr[], int n) {
		int i = 0;
		int j = n-1;
		int arr1[] = new int [n];
		while(j>0 && i<n-1) {
			if(arr[i] == arr[j]) {
				arr1[j]= 0;
//				arr1[i] = 0;
				i++;
			}
			else if(i==j) {
				j = n;
				i++;
			}
			arr1[j] = arr[j];
			j--;
		}
		for(int k = 0; k<n;k++) {
			System.out.print(arr1[k]+",");
		}
	}

	public static void main(String[] args) {
        int arr[] = {2,5,3,5,6,3};
        int n = arr.length;
        Array(arr , n);
        
	}
}
