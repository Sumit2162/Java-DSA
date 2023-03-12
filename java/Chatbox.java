import java.util.*;

//  import javax.sql.rowset.spi.SyncResolver;
public class Chatbox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter message");
        String message = scanner.nextLine();
        if(message.equals("hii")||message.equals("hello")||message.equals("hey")){
            System.out.println("hello sumit jaat");
        }
        else if(message.equals("tell me birthday date")||message.equals("address")){
            System.out.println("MO no.8909322482");
        }
        else{
            System.out.println("thank you very much darling good by");
        }
        scanner.close();

    
}
    
}
