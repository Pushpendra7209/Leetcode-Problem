package d;

public class Q2119 {
	public boolean isSameAfterReversals(int num) {
	       int a = num;
	       

	       int rev1 = 0;
	       while(a> 0){
	           int c = a % 10;
	           rev1 = rev1*10 + c;
	           a = a / 10;
	       }
	       int b = rev1;
	       int rev2 = 0;
	       while(rev1>0){
	           int c = rev1 % 10;
	           rev2 = rev2 * 10 + c;
	           rev1 = rev1 / 10;
	       }
	       if(rev2 == num){
	           return true;
	       }
	       return false;
	    }
}
