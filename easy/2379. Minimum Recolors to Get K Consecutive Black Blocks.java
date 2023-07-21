class Solution {
    public int minimumRecolors(String blocks, int k) {
        int s  = 0;
        int e = 0;
        int count = 0;
        int ans = Integer.MAX_VALUE;
        while(e<blocks.length())
        {
            if(blocks.charAt(e)=='W'){
                count++;
            }
            if( e - s + 1 == k)
            {
                ans  = Math.min(ans,count);
                if(blocks.charAt(s) == 'W'){
                    count--;
                }
                s++;
            }
            e++;
        }
        return ans;
    }
}
