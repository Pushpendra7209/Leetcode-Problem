import java.util.*;
public class Asteriod_collision {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> s  = new Stack<>();
        int i = 0;
        while(i<arr.length)
        {
            if(s.isEmpty()){
                s.push(arr[i]);
                i++;
            }
            else if(s.peek() > 0){
                if(arr[i] > 0){
                    s.push(arr[i]);
                    i++;
                }
                else if(s.peek() == Math.abs(arr[i])){
                    s.pop();
                    i++;
                }
                else if(s.peek() > Math.abs(arr[i])){
                    i++;
                }
                else{
                    s.pop();
                }
            }
            else if(s.peek() < 0){
                s.push(arr[i]);
                i++;
            }


        }
        int ans[] = new int[s.size()];
        for(int k =s.size()-1; k >= 0; k--){
            ans[k] = s.peek();
            s.pop();
        }
        return ans;
    }
}
