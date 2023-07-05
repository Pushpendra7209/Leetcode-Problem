class Solution {
    public int longestBeautifulSubstring(String word) {
        int count  = 1;
        int len = 1;
        int maxlen = 0;
        for(int i = 1; i<word.length(); i++)
        {
            if(word.charAt(i-1)<= word.charAt(i)){
                if(word.charAt(i-1) != word.charAt(i))
                {
                    count++;
                }
                len++;
                if(count == 5){
                    maxlen = Math.max(maxlen,len);
                }
            }
            else{
                count = 1;
                len = 1;
            }
        }
        return maxlen;
    }
}
