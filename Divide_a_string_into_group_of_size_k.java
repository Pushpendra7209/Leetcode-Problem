public class Divide_a_string_into_group_of_size_k {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int sub=0;
        if(n%k==0){
            sub = n/k ;
        }
        else{
            sub = n/k + 1;
        }
        int j=0;
        String arr[] = new String[sub];
        for(int i = 0; i<s.length(); i++){
            String q="";
            int size = i;
            while(i<size+k){
                if(i>=s.length()){
                    q += fill;
                }
                else
                    q+=s.charAt(i);
                i++;
            }
            i--;
            arr[j] = q;
            j++;
        }
        return arr;
    }
}
