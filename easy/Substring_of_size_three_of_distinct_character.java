public class Substring_of_size_three_of_distinct_character {
    public int countGoodSubstrings(String s) {
        if( s.length() < 3){
            return 0;
        }
        int i =0 , count =0;
        int n = s.length()-2;
        while(i<n)
        {
            if(s.charAt(i) != s.charAt(i+1) && s.charAt(i+1) !=s.charAt(i+2) && s.charAt(i+2) != s.charAt(i)){
                count++;

            }
            i++;
        }
        return count;
    }
}
