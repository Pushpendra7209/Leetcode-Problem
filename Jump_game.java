public class Jump_game {
        public boolean canJump(int[] nums) {
            int jump=nums[0];
            for(int i =0; i<nums.length; i++){
                if(jump<i){
                    return false;
                }
                jump = Math.max(jump,i+nums[i]);
                if(jump>=nums.length-1){
                    return true;
                }
            }
            return true;
    }
    public static void main(String[] args) {
            Jump_game j = new Jump_game();
            int arr[] ={3,2,1,0,4};
            System.out.println(j.canJump(arr));
    }
}
