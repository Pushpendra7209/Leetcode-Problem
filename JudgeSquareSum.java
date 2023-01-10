package d;

public class JudgeSquareSum {
	 public boolean judgeSquareSum(int c) {
	       
	       double p= Math.sqrt(c);
	       long n = (int)(p)+1;
	       long i=0;
	       while(i<=n){
	           long res = i*i + n*n ;
	           if(res == c){
	               return true;
	           }
	           else if(res > c){
	               --n;
	           }
	           else{
	               i++;
	           }
	       }
	       return false;
	    }
}
