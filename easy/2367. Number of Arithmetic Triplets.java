class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        Set<Integer> s = new HashSet<>();
        for(int a : nums){
            if(s.contains(a-diff)  && s.contains(a-2*diff)){
                count++;
            }
            s.add(a);
        }
        return count;
    }
}
