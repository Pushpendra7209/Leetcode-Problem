public class Reverse_word_in_a_string {
    public String reverseWords(String s) {
        int i =0;
        int n = s.length();
        String result ="";
        while(i<n)
        {
            while(i<n && s.charAt(i) ==' '){
                i++;
            }
            if(i >= n){
                break;
            }
            int j = i+1;
            while(j<n && s.charAt(j) != ' '){
                j++;
            }
            if(result == ""){
                result = s.substring(i,j);
            }
            else{
                result = s.substring(i,j)+" "+result;

            }
            i = j+1;

        }
        return result;
    }
}
