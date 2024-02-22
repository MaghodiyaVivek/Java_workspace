package Task209;

import java.util.Scanner;

public class Task2 
{

	
	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your Marks :");
		int marks = sc.nextInt();
		
		
		int a = 80;
		int b = 60;
		int c = 60;
		int d = 44;
		int e = 44;
		int z = a+b+c+d+e;
		z = z/5;
		System.out.println("percentage is : " + z);
		
		
		if(marks>=70)
		{
			System.out.println("Distinction");
		}
		else if(marks>=60)
		{
			System.out.println("First class");
		}
		else if(marks>=50)
		{
			System.out.println("Second class");
		}
		else if(marks>=40)
		{
			System.out.println("Pass class");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
	}
}
