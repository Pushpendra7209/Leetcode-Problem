class Solution {
    public String finalString(String s) {
        String ans="";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'i'){
                ans = reverse(ans.substring(0,ans.length()));
            }
            else{
                ans += s.charAt(i);
            }
        }
        return ans;
        
    }
    public String reverse(String str ){
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
