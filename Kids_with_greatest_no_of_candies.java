import java.util.*;
public class Kids_with_greatest_no_of_candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = 0;
        for(int i=0; i<candies.length; i++)
        {
            if(candies[i] > max){
                max = candies[i];
            }
        }
        for(int i=0; i<candies.length; i++){
            if(candies[i]+extraCandies >= max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}
