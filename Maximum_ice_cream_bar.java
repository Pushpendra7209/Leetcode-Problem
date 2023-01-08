package d;

import java.util.Arrays;

public class Maximum_ice_cream_bar {
	public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;
        for(int i=0; i<costs.length; i++){
            if(costs[i]<=coins){
                count++;
                coins-=costs[i];
            }
            else{
                break;
            }
        }
        return count;
    }
}
