package testcases;

import java.util.Scanner;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no.: ");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n)
				System.out.print("*");
				else
					System.out.print(" ");
	}
			System.out.println();

}

	}

}
