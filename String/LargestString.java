public class LargestString {
    public static void main(String[] args) {
        String Fruits[]={"Apple","apple","mango"};
        String largest =Fruits[0];
        for(int i=1;i<Fruits.length;i++){
            if(largest.compareTo(Fruits[i])<0){//it's consider only small charecter  
                 largest=Fruits[i];
            }
            // if(largest.compareToIgnoreCase(Fruits[i])<0){//it's consider both char(Small & large)
            //     largest=Fruits[i];
            // }
        }
        System.out.println(largest);
    }
}
