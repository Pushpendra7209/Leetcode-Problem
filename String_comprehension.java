package d;

public class String_comprehension {
	 public int compress(char[] chars) {
	        if(chars.length <=1){
	            return chars.length;
	        }
	        String s = ""+chars[0];
	        for(int i = 1; i<chars.length; i++){
	            if(chars[i] == chars[i-1]){
	                int count = 1;
	                while( i < chars.length){
	                    if(chars[i-1] == chars[i]){
	                        count++;
	                    }
	                    else{
	                        break;
	                    }
	                    i++;
	                }
	                String p = "";
	                while(count > 0){
	                    int a = count % 10;
	                    p = a + p;
	                    count /= 10;
	                }
	                s += p;
	                i--;
	            }
	            else{
	                s += chars[i];
	            }
	        }
	        for(int i=0; i<s.length(); i++){
	            chars[i]=s.charAt(i);
	        }
	        return s.length();
	    }
}
