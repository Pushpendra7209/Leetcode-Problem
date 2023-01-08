package d;

public class nth_magic_number {
	public static void main(String[] args) {
		System.out.println(magic_number(5));
	}
	public static int  magic_number(int n) {
		int count=1;
		int sum=0;
		while(n>0) {
			int x=n%2;
			sum+=Math.pow(5,count)*x;
			count++;
			n/=2;
		}
		return sum;
	}
}
