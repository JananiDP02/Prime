package testcases;

import java.util.Scanner;

public class TestCase5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no.: ");
		int n=s.nextInt();
		int sum=0,d;
		while(n!=0) {
			d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println("Sum of digits: "+sum);
		}

	}

