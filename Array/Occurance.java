
public class Occurance {

	public static void main(String[] args) {
         int arr[]= {10,20,20,40,50,50,50,50,60,70,80};
         int search = 50;
         int start=0;
         int end= arr.length-1;
         int firstindex=-1;
         int lastindex =-1;
         while(start<=end) {
        	 int mid = (start+end)/2;{
        		 if(search==arr[mid]) {
        			 firstindex=mid;
        			 end = mid-1;
        		 }
        		 else if(search<arr[mid]) {
        			 end= mid-1;
        		 }
        		 else if(search>arr[mid]) {
        			 start =mid+1;
        		 }
        	 }
//        	 System.out.println("firstindex:"+firstindex);
        	 
         }
         start = 0;
         end = arr.length-1;
         while(start<=end) {
        	 int mid = (start+end)/2;
        	 if(arr[mid]==search) {
        		 lastindex = mid;
        		 start = mid+1;
        	 }
        	 else if(search>arr[mid]) {
        		 start = mid+1;
        	 }
        	 else if(search<arr[mid]) {
        		 end = mid-1;
        		 
        	 }
         }
         System.out.println("Occurance: "+((lastindex-firstindex)+1));
	}

}
