import java.util.*;

public class Zigzag_Conversion {
    public static void main(String[] args) {
        String s = "pushpendrakumar";
        int numrows = 3;
        System.out.println(zigzag(s,numrows));
    }
    public static String zigzag(String s, int num) {
        Map<Integer, StringBuilder> map = new HashMap<>();
        int pos = 0;
        boolean incr = true;
        for(char c: s.toCharArray()){
            if(pos == num){
                incr = false;
            }
            if(pos == 1){
                incr = true;
            }
            if(incr){
                pos++;
            }
            else{
                pos--;
            }
            if(!map.containsKey(pos)){
                map.put(pos, new StringBuilder());
            }
            map.get(pos).append(c);
        }
        StringBuilder res = new StringBuilder();
        for(int i:map.keySet()){
            res.append(map.get(i));
        }
        return res.toString();
    }
    }

