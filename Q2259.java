package d;

public class Q2259 {
	 public static String removeDigit(String number, char digit) {
	        int count = 0;
	        for(int j = 0 ; j < number.length(); j++){
	            if(number.charAt(j)  == digit){
	                count++;
	            }
	        }
	        System.out.println(count);
	      String s="";
	      int i =0;
	      int flag = 0;
	      for( i=0; i<number.length()-1; i++){
	          if(number.charAt(i)==digit){
	              if(count == 1){
	                  break;
	              }
	              else {
	            	  count--;
	              }
	              int a = number.charAt(i) -'0';
	              int b = number.charAt(i+1) - '0';
	              if(b>a){
	                //   flag = 1;
	                  break;
	              }
	          }
	           
	          s += number.charAt(i); 
	         // count--;
	          
	      }
	        // if(flag == 0){
	        //     return s;
	        // }
	        s+= number.substring(i+1,number.length());
	        return s;
	    }
	 public static void main(String[] args) {
		String s = "2313";
		System.out.println(removeDigit(s,'3'));
	}
}
