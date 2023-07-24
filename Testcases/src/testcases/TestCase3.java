package testcases;

import java.util.Scanner;

public class TestCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no.: ");
		int n=s.nextInt();
		int c=0;
		while(n!=0) {
			n=n/10;
			c++;
		}
		System.out.println("No. of digits: "+c);
		}

	}


