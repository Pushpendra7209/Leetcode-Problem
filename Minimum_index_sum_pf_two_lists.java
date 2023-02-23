class Minimum_index_sum_pf_two_lists{
	public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i=0; i<list1.length; i++){
            for(int j=0; j<list2.length; j++){
                if(list1[i].equals(list2[j])){
                     if(min == (i+j)){
                        list.add(list1[i]);
                        break;
                    }
                    if(min > (i+j)){
                        list.clear();
                        list.add(list1[i]);
                        min = (i+j);
                        break;
                    }

                   
                }
            }
        }
        String arr[] = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}