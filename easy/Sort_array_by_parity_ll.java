public class Sort_array_by_parity_ll {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        while(i<n){
            if(i % 2 == 0 && nums[i] % 2 == 0){
                i++;

                continue;
            }
            else if(i % 2 != 0 && nums[i] % 2 != 0 )
            {
                i++;

                continue;
            }
            j = i+1;
            while(j < n){
                if(j%2 == 0 && nums[j] % 2==0){
                    j+= 2;
                    continue;
                }
                else if(j%2 != 0 && nums[j] % 2 != 0){
                    j+=2;
                    continue;
                }
                else{
                    break;
                }
            }


            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;

        }
        return nums;
    }
}
