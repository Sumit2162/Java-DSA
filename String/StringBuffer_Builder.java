
public class StringBuffer_Builder {

	public static void main(String[] args) {
//         StringBuffer sb = new StringBuffer();//this is synchronizeed
         StringBuilder sb = new StringBuilder();//this is asynchronized

         System.out.println(sb.capacity()+","+sb.length());
         sb.append("Sumit");
         System.out.println(sb.capacity()+","+sb.length());
         sb.append("sddfgdfhghdgfhhfgrhgrhbgrhgggiuhghtigdfngnfkddbnfgdbhbfhdshfhdbfhbdhbfhdsfjhbdsj");
         System.out.println(sb.capacity()+","+sb.length());

	}

}
