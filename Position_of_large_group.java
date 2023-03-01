package d;
import java.util.*;
public class Position_of_large_group {
	 public List<List<Integer>> largeGroupPositions(String s) {
	        List<List<Integer>> list1 = new ArrayList<>();
	        for(int i =0; i<s.length()-1; i++){
	            if(s.charAt(i) == s.charAt(i+1)){
	                int count =1;
	                int a = i;
	                ArrayList<Integer> list2 = new ArrayList<>();
	                while(i<s.length()-1){
	                    if(s.charAt(i) == s.charAt(i+1)){
	                        count++;
	                    }
	                    else{
	                        break;
	                    }
	                    i++;
	                }
	                if(count >= 3){
	                    list2.add(a);
	                    list2.add(i);
	                    list1.add(list2);
	                }
	            }
	        }
	        return list1;
	    }
}
