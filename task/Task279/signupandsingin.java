package Task279;

import java.util.Scanner;

public class signupandsingin 
{
	
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("-----------------Sign Up --------------------------");
		
		System.out.println("Enter Your Firstname");
		String fname = sc.next();
		
		System.out.println("Enter Your Lastname");
		String lname = sc.next();
		
		System.out.println("Enter Your Email");
		String email = sc.next();
		
		System.out.println("Enter Your Password");
		String pass = sc.next();
		
		
		Model m =new Model();
		
		
		m.setFirstname(fname);
		m.setLastname(lname);
		m.setEmail(email);
		m.setPassword(pass);
		
		
		System.out.println("Sign Up Succesfully Done");
		
		
		System.out.println("-----------------Sign In --------------------------");
		
		System.out.println("Enter Your name");
		String name1 = sc.next();
		
		System.out.println("Enter Your Password");
		String pass1 = sc.next();
		
		if(name1.equals(m.getname1()) && pass1.equals(m.getPassword()))
		{
			System.out.println("Logged in Succesfully");
		}
		else
		{
			System.out.println("Wrong Credentials");
		}
		
		
	}
}
