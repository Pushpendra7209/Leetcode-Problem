package d;
import java.util.*;
public class String_matching_in_array {
	 public List<String> stringMatching(String[] words) {
	        ArrayList<String> list = new ArrayList<String>();
	        for(int i=0; i<words.length; i++){
	            for(int j=0; j<words.length; j++){
	                if(i != j && words[i].contains(words[j]) && !list.contains(words[j])){
	                  
	                        list.add(words[j]);
	                    }
	                
	            }
	        }
	        return list;
	    }
}
