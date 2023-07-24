package testcases;

import java.util.Scanner;

public class TestCase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=s.nextInt();
		System.out.println("Enter m: ");
		int m=s.nextInt();
		System.out.println("Enter N: ");
		int N=s.nextInt();
		System.out.print("result: ");
		for(int i=n;i<=m;i++) {
			int c=i;
			int sum=0,d;
			while(c!=0) {
				d=c%10;
				sum=sum+d;
				c=c/10;
			}
			if(N==sum) {
				System.out.print(i+" ");
			}
		}
		
		

	}

}
