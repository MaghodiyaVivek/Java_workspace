package Moduel2;

//Create a class with a method that prints "This is a parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call 1 - method of parent class by object of parent class 2 - method of child class by object of child class 3 - method of parent class by object of child class
public class Program24 
{

	class ParentClass
	{
	    public void display() {
	        System.out.println("This is a parent class.");
	    }
	}

	
	class ChildClass extends ParentClass 
	{
	    public void displayChild() {
	        System.out.println("This is a child class.");
	    }
	}

	public class Main 
	{
	    public static void main(String[] args) 
	    {
	       
	        Program27 ParentClass = new Program27();
	        
	        Moduel2.Program24.ParentClass parentObject = null;
			parentObject.display();

	       
	        ChildClass childObject = new ChildClass();
	      
	        childObject.displayChild();

	   
	        childObject.display();
	        
	    }
	}
}
