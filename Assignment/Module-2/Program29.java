package Moduel2;

// Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass
public class Program29 
{

	abstract class Parent 
	{
	    abstract void message();
	}

	class FirstSubclass extends Parent 
	{
	   
	    @Override
	    void message() 
	    {
	        System.out.println("This is first subclass");
	    }
	}

	class SecondSubclass extends Parent 
	{
	    @Override
	    void message() 
	    {
	        System.out.println("This is second subclass");
	    }
	}

	public class Main {
	    public static void main(String[] args) 
	    {
	       
	        Program29 first = new Program29();
	        first.message(); 

	        
	        Program29 second = new Program29();
	        second.message(); 
	    }
	}

	public void message() {
		
		
	}

}
