class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=nums.length-1; i>=0; i--){
            int a = nums[i];
            while(a > 0){
                list.add(0,a % 10);
                a /= 10;
            }
        }
        int arr[] = new int[list.size()];
        for(int i=0; i<arr.length; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
