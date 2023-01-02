package hashing;
import java.security.DomainCombiner;
import java.util.*;
public class Group_anagrams {
	public static void main(String[] args) {
		String [] strs = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagrams(strs));
	}
public static List<List<String>> groupAnagrams(String[] strs) {
	
        
	List<List<String>> list = new ArrayList<List<String>>();
	HashMap<String,ArrayList<String>> map = new HashMap<>();
	 
	for(int i=0; i<strs.length; i++) {
		String s= sort(strs[i]);
		if(!map.containsKey(s)) {
			map.put(s, new ArrayList<String>());
		}
		map.get(s).add(strs[i]);
	}
	
	for(Map.Entry<String,ArrayList<String>> ele:map.entrySet()){
        list.add(ele.getValue());
    }
	return list;
    }
 	public static String sort(String str) {
 		char arr[] = str.toCharArray();
 		Arrays.sort(arr);
 		String s= new String (arr);
 		
 		return s;
 	}
}
