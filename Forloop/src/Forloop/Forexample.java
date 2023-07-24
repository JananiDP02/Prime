package Forloop;

public class Forexample {
	
		public static void main(String[] args) 
		{ 
		for(int i = 10; i>=1;i--)
		{ 
		System.out.print("Value of i:");
		System.out.println(i);
		
		}
		int a[]= {10,20,30,40,50}; 
		//for integer array
		for(int i:a)
		{
		System.out.print(i+" "); 
		}
		System.out.println();
		char ch[]= {'j','a','v','a'};
		for(char c:ch)
		{
		System.out.print(c); 
		}
		System.out.println();
		String s1[]= {"Java","programming","learning"};
		//for String array
		for(String s:s1)
		{
		System.out.print(s+" "); 
		}
		int i = 11;
		do {
		System.out.print(i);
		i++;
		} while (i <= 1);
		}

		}
		
		


