package fibo;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,c = 0,n=10;
		
		while(c<=n) {
			System.out.print(n1+" ");
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			c=c+1;
			
			
		}
		

	}

}
