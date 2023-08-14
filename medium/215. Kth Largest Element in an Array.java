class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p =  new PriorityQueue<>(Collections.reverseOrder());
        int a=0;
        for(int i=0; i<nums.length; i++){
           // if(!p.contains(nums[i]))
            p.add(nums[i]);
        }
        for(int i=0; i<k; i++){
           a=p.peek();
            p.poll();
        }
        return a;
    }
}
