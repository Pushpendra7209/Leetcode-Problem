class Shortest_distance_to_a_character{
	public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int arr[] = new int[n];
        if(n == 0){
            return arr;
        }
        for(int i=0; i<n; i++){
            int left = i;
            int right = i;
            while(left>=0 || right<n){
                if(left>=0 && s.charAt(left) == c){
                    arr[i] = Math.abs(i-left);
                    break;
                }
                else if(right<n && s.charAt(right) == c){
                    arr[i] = Math.abs(right - i);
                    break;
                }
                left--;
                right++;
            }
        }
        return arr;
    }
}