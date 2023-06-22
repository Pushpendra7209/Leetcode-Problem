import java.util.*;
public class Longest_nice_substring {
    public String longestNiceSubstring(String s) {
        if(s.length()<2){
            return "";
        }
        HashSet<Character> set = new HashSet<Character>();
        for(int i=0; i<s.length(); i++)
        {
            set.add(s.charAt(i));
        }
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)<97 && set.contains((char)(s.charAt(i)+32))){
                continue;
            }
            else  if(s.charAt(i)>=97 && set.contains((char)(s.charAt(i)-32))){
                continue;
            }

            String prev  = longestNiceSubstring(s.substring(0,i));
            String next = longestNiceSubstring(s.substring(i+1));

            return prev.length()>=next.length()?prev:next;
        }
        return s;
    }
}
