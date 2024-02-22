package Task279;

import java.util.Scanner;

public class BankExsignupandsignin 
{


	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("-----------------Sign Up --------------------------");

		
		
		System.out.println("Enter Your Firstname");
		String fname = sc.next();
		
		System.out.println("Enter Your Lastname");
		String lname = sc.next();
		
		System.out.println("Enter Your Password");
		String pass = sc.next();
		
		
		Fbmodel m =new Fbmodel();
		
		
		m.setfirstname(fname);
		m.setlastname(lname);
		m.setPassword(pass);

		System.out.println("Sign Up Succesfully Done");
		
		
		System.out.println("-----------------Sign In --------------------------");
		
		System.out.println("Enter Your name");
		String name1 = sc.next();
		
		System.out.println("Enter Your Password");
		String pass1 = sc.next();
		
		
		
	}
}
	
