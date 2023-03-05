package d;

public class Find_the_index_of_the_first_occurence_in_a_String {
   public int strStr(String haystack, String needle) {
        
        for(int i=0; i<haystack.length(); i++){
            int a=i; 
            int j=0;
            while(a<haystack.length() && j<needle.length()){
                if(haystack.charAt(a)==needle.charAt(j)){
                    j++;
                    a++;
                }
                else{
                    break;
                }
                
            }
            if(j==needle.length())
                return i;
        }
        return -1;
    }
}
