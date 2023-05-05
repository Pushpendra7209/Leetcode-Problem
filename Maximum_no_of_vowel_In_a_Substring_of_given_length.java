import java.util.Arrays;
import java.util.List;

public class Maximum_no_of_vowel_In_a_Substring_of_given_length {
    public static int maxVowels(String s, int k) {
        List<Character> vowels = Arrays.asList('a','e','i','o','u');

        int vcount = 0;
        for(int i=0; i<k; i++){
            if(vowels.contains(s.charAt(i))){
                vcount++;
            }
        }
        int mvc = vcount;
        int l=0, r=k-1;
        while(r<s.length()-1){
            if(vowels.contains(s.charAt(l))) vcount--;
            l++;
            r++;
            if(vowels.contains(s.charAt(r))) vcount++;

            mvc = Math.max(vcount,mvc);
        }
        return mvc;

    }

    public static void main(String[] args) {
        String s = "abciii";
        System.out.println(maxVowels(s,3));
    }
}
