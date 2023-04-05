public class BarChart {
    static void getMax(int arr,int n){

    }
    public static void main(String[] args) {
        int arr[]= {2,0,1,3,5,6,7};
        int n = arr.length;
        int max = getMax(arr,n);
        for(int i=max;i>=0;i--){
            for(int j=0; j<n;j++){
                if(i>=arr[j]){
                    System.out.println("\t");
                }
                else{
                    System.out.println("\t*");
                }
            }
            System.out.println();
        }
    }
}
