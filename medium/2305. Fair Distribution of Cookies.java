class Solution {
    int res=Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        int child[] = new int[k];
        backtract(0,child,cookies,k);
        return res;
    }
    
    public void backtract(int i , int child [], int cookies[],int k)
    {
        if(i>=cookies.length){
            int max = 0;
            for(int p=0; p<k; p++){
                if(child[p] > max){
                    max = child[p];
                }
            }
            // System.out.println(res);
            res = Math.min(max,res);
            return ;
        }
        else{
             int bag = cookies[i];
        for(int j=0; j<k; j++)
        {
            child[j] += bag;
            backtract(i+1,child, cookies,k);
            child[j] -= bag;
        }
        }
       
    }
}
