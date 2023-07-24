package testcases;

import java.util.Scanner;

public class TestCase6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=s.nextLine();
		
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i+=2) {
			int t=c[i+1]-'0';
			while(t-- >0) {
				System.out.print(c[i]);
			}
		}

	}

}
