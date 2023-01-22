package d;

public class Longest_Palindrome_substring {
	
	    public String longestPalindrome(String s) {
	      int n=s.length(), max=0, max2=0;
	        if(n<2)
	            return s;
	        String p="", Q="";
	         String p1="", Q1="";
	        for(int i=0; i<n; i++){
	            int l=i;
	            int r=i;
	            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
	            //  System.out.println(l+" "+r);
	                if(l==r){
	                    p=s.charAt(l)+p;
	                }
	                else{
	                    p=s.charAt(l)+p+s.charAt(r);
	                }
	                  r++;
	                l--;
	            }
	            int len=r-l-1;
	            if(len>max){
	                max=len;
	                Q=p;
	               
	            }
	             p="";
	        }
	         for(int i=0; i<n-1; i++){
	            int l=i;
	            int r=i+1;
	            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
	             // System.out.println(l+" "+r);
	               
	                    p1=s.charAt(l)+p1+s.charAt(r);
	                
	                  r++;
	                l--;
	            }
	            int len=r-l-1;
	            if(len>max2){
	                max2=len;
	                Q1=p1;
	               
	            }
	              p1="";
	        }
	        return Q.length()>Q1.length()?Q:Q1;
			
		}
	
}
