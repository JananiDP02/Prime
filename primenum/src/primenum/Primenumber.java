package primenum;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no.: ");
		int n=s.nextInt();
		boolean flag=false;
		if(n<=1)            //ignore 0 &1
			System.out.println("no entry");
		for(int i=2;i<n;i++) {
			if(n%i==0) {     //divide by every num
				flag=true;
			
		}
		
			
		}
		if(!flag)	
		System.out.println(n+" is a Prime Number");
		else
		System.out.println(n+" is not a prime number");
			
	}

}
