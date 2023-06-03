public class reverse_String_ll {
    public String reverseStr(String s, int k) {
        int n = s.length();
        String ans ="";
        int i =0;
        int j=0;
        while(i<n)
        {
            String a = "";
            for(j=i; j<i+k; j++){
                if(j == n)
                {
                    break;
                }
                else{
                    a += s.charAt(j);
                }
            }
            ans += reverse(a) ;
            if(j+k<=n){
                ans +=s.substring(j,j+k);
            }
            else{
                ans+=s.substring(j,n);
            }
            i = j+k;
        }
        return ans;
    }

    public static String reverse(String s)
    {
        String p="";
        for(int i = s.length()-1; i>=0; i--)
        {
            p+=s.charAt(i);
        }
        return p;
    }
}
