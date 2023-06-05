public class Reverse_String_lll {
    public String reverseWords(String s) {
        int l =0;
        int r = 0;
        int n = s.length();
        String ans ="";
        while(l< n){

            while(r < n)
            {
                if(s.charAt(r) != ' '){
                    r++;
                }
                else{
                    break;
                }
            }
            ans +=reverse(s.substring(l,r))+" ";
            l = r+1;
            r = l;
        }
        return ans.trim();
    }
    public static String reverse( String s)
    {
        String t="";
        for(int i=s.length()-1; i>=0; i--)
        {
            t +=s.charAt(i);
        }
        return t;
    }
}
