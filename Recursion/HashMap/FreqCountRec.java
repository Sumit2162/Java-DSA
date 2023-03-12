package HashMap;

public class FreqCountRec {
    Static HashMap<Character , Integer>getCount(String str, int index){
        if(index== str.length()){
            HashMap<Character,Integer>temp = new HashMap<>();
            return temp;
        }
        HashMap<Character, Integer>map = getCount(str, index+1);
        char singleChar = str.charAt(index);
        if(map.get(singleChar==null)){
            map.put(singleChar,1);
        }
        else{
            int prevValue = map.get(singleChar);
            map.put(singleChar,prevValue+1);
        }
    }
    public static void main(String[] args) {
        String str = "sumit tomar";
    }
}
