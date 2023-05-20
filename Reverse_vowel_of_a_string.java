import java.util.*;
public class Reverse_vowel_of_a_string {
    public String reverseVowels(String s) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        list.add('A');
        list.add('E');
        list.add('I');
        list.add('O');
        list.add('U');

        char [] arr = s.toCharArray();
        int  i =0;
        int j=s.length()-1;
        while(i<j){
            if(!list.contains(arr[i])){
                i++;
                continue;
            }
            if(!list.contains(arr[j])){
                j--;
                continue;
            }
            char c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
            i++;
            j--;
        }
        return new String(arr);
    }
}
