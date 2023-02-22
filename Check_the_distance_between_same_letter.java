class Check_the_distance_between_same_letter{
	 public boolean checkDistances(String s, int[] distance) {
        for(int i=0; i<s.length()-1; i++){
            int index = s.charAt(i) - 97;
            int find = i+1;
            while(find <s.length()){
                if(s.charAt(find) == s.charAt(i)){
                    if(distance[index] != find - (i+1)){
                        return false;
                    }
                    break;
                }
                find++;
            }
        }
        return true;
    }
}