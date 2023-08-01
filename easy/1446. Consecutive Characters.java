class Solution {
    public int maxPower(String s) {
        int ans = 1;
        int count = 1;
        for(int i = 1; i<s.length(); i++)
        {
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }
            else {
                if(count > ans){
                    ans = count ;

                }
                count = 1;
            }
        }
            if(count > ans){
                    ans = count ;

                }
        return ans;
    }
}
