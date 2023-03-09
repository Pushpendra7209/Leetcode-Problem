class Summary_range{
	 public List<String> summaryRanges(int[] nums) {
        ArrayList<String> list = new ArrayList<>();
        if(nums.length == 0){
            return list;
        }
        if(nums.length == 1){
            String a = Integer.toString(nums[0]);
            list.add(a);
            return list;
        }
        int n = nums.length;
        for(int i = 0; i<n; i++){
            String z = ""+nums[i];
            if(i == n-1){
                
                list.add(z);
                break;
            }
            if(nums[i+1] - nums[i] != 1){
                list.add(z);
            }
            else{
                while(i<n-1){
                    if(i+1 == n-1 && nums[i+1] -nums[i] == 1){
                        String p = z+"->"+nums[i+1];
                        list.add(p);
                        i++;
                        break;
                    }
                    else if(nums[i+1] - nums[i] == 1){
                        i++;
                    }
                    else{
                        String str = z+"->"+nums[i];
                        list.add(str);
                        break;
                    }
                }
            }
        }
        return list;
    }
}