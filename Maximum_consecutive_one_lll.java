public class Maximum_consecutive_one_lll {
    public int longestOnes(int[] arr, int k) {
        int i =0;
        int j =0;
        int max =0, zeroCount = 0;
        while( j < arr.length)
        {

            if(arr[j] == 0){
                zeroCount++;
            }
            while(zeroCount > k ){
                if(arr[i] == 0){
                    zeroCount--;
                }
                i++;
            }
            max = Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}
