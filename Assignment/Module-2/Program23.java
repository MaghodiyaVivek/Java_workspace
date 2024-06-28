package Moduel2;

//Create a class to print the area of a square and a rectangle. The class has two methods with the same name but different number of parameters. The method for printing area of a rectangle has two parameters which are length and breadth respectively while the other method for printing area of square has one parameter which is side of square.


public class Program23 
{

	public class AreaCalculator 
	{
	   
	    public void area(int side) 
	    {
	        int squareArea = side * side;
	        System.out.println("The area of the square with side " + side + " is " + squareArea + " square units.");
	    }

	   
	    public void area(int length, int breadth) 
	    {
	        int rectangleArea = length * breadth;
	        System.out.println("The area of the rectangle with length " + length + " and breadth " + breadth + " is " + rectangleArea + " square units.");
	    }

	    
	    public static void main(String[] args) 
	    {
	        AreaCalculator calculator = new AreaCalculator();
	        calculator.area(5); // This will print the area of a square with side 5
	        calculator.area(4, 6); // This will print the area of a rectangle with length 4 and breadth 6
	    }
	}

}
