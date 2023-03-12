public class Patern2 {public static void main(String[] args) {
    // for(int i = 0; i<5; i++ ){
        // for(int j = 0; j<5-i; j++){
           for(int i = 0; i<5; i++){
            for(int j = 5; j>i; j--){
                  System.out.print(" ");
        }
        for(int z = 0; z<2*i+1; z++){
            System.out.print("*");
        }
        System.out.println();
    }
}
    
}
