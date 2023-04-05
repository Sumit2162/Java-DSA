public class SortChar {
  public static void main(String[] args) {

    String str = "MEERUT";
    char [] charr=str.toCharArray(); 
    for(int i=0;i<charr.length;i++){
        for(int j=i+1;j<charr.length;j++){
            if(charr[i]>charr[j]){
            char temp=charr[i];
              charr[i]=charr[j];
              charr[j]=temp;
            }
        }
    }
    for(int k=0;k<charr.length;k++){
        System.out.print(charr[k] + "  ");
    }

  }
}
