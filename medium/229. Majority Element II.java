class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashMap<Integer, Integer> set = new HashMap<>();
        for(int i=0; i< arr.length; i++){
            if(set.containsKey(arr[i])){
                set.put(arr[i], set.get(arr[i])+1);
            }
            else{
                set.put(arr[i], 1);
            }
        }
        for(int k:set.keySet()){
            if(set.get(k)>n/3){
                list.add(k);
            }
        }
        return list;
    }
}
