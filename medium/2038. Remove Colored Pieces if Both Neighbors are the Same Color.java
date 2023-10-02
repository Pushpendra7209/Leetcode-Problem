class Solution {
    public boolean winnerOfGame(String colors) {
        int no_of_A_remove = 0;
        int no_of_B_remove = 0;
        for(int i=1; i<colors.length()-1; i++){
            if(colors.charAt(i)=='A' && colors.charAt(i-1)=='A' && colors.charAt(i+1)=='A'){
                no_of_A_remove++;
            }
            else if(colors.charAt(i)=='B' && colors.charAt(i-1)=='B' && colors.charAt(i+1)=='B'){
                no_of_B_remove++;
            }
        }
        if(no_of_A_remove > no_of_B_remove){
            return true;
        }
        return false;
    }
}
