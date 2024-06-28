package Moduel2;

//Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to initialize the length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.

public class Program26 
{

	class Rectangle 
	{
	    protected int length;
	    protected int breadth;

	    
	    public Rectangle(int length, int breadth) 
	    {
	        this.length = length;
	        this.breadth = breadth;
	    }

	   
	    public void printArea() 
	    {
	        int area = length * breadth;
	        System.out.println("Area of Rectangle: " + area);
	    }

	    public void printPerimeter() 
	    {
	        int perimeter = 2 * (length + breadth);
	        System.out.println("Perimeter of Rectangle: " + perimeter);
	    }
	}

	class Square extends Rectangle 
	{
	   
	    public Square(int side) 
	    {
	        super(side, side); 
	    }
	}

	public class Main 
	{
	    public static void main(String[] args) 
	    {
	      
	        Rectangle rectangle = new Rectangle(4, 5);
	        rectangle.printArea(); 
	        rectangle.printPerimeter(); 

	       
	        Square square = new Square(4);
	        square.printArea(); 
	        square.printPerimeter(); 
	    }
	}

}
