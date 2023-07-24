package Test;

import java.util.Scanner;

public class TestCase12 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the string: ");
			String str=s.nextLine();
			char c[]=str.toCharArray();
			int count=1;
			for(int i=0;i<=c.length-1;i++) {
				if(c[i]==' ' && c[i+1]!=' ') {
					count++;
				}
			}
			 System.out.println("The no. of words are "+count);
		}
	}

}
