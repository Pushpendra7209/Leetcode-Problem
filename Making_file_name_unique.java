package d;
import java.util.*;

public class Making_file_name_unique {
	public static void main(String[] args) {
		String names[] = {"onepiece","onepiece(1)","onepiece(2)","onepiece(3)","onepiece"};
		String [] names1 = {"pes","fifa","gta","pes(2019)"};
		String [] names2 = { "gta","gta(1)","gta","avalon"};
		System.out.println(Arrays.toString(getFolderNames(names2)));
	}
	
	
	 public static String[] getFolderNames(String[] names) {
		 int j=1;
		 String arr[] = new String[names.length];
	        HashMap<String , Integer> map = new HashMap<>();
	        for(int i=0; i<names.length; i++) {
	        	if(map.containsKey(names[i])) {
	        		for( j=1; j<names.length; j++) {
	        			if(!map.containsKey(names[i]+"("+j+")")) {
	        			map.put(names[i]+(j), 1);
	        			break;
	        		}
	        		}
	        		names[i]=names[i]+"("+j+")";
	        	}
	        	else {
	        		map.put(names[i], 1);
	        	}
	        }
	        return names;
	    }
}
