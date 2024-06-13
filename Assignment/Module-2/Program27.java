package Moduel2;

// Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.
public class Program27 
{

	class Triangle {
	    // Data members for the sides of the triangle
	    private double side1;
	    private double side2;
	    private double side3;

	    // Constructor without parameters, initializes the sides to 3, 4, and 5
	    public Triangle() {
	        this.side1 = 3;
	        this.side2 = 4;
	        this.side3 = 5;
	    }

	    // Method to calculate and print the perimeter of the triangle
	    public void printPerimeter() {
	        double perimeter = side1 + side2 + side3;
	        System.out.println("Perimeter of Triangle: " + perimeter);
	    }

	    // Method to calculate and print the area of the triangle using Heron's formula
	    public void printArea() {
	        double semiPerimeter = (side1 + side2 + side3) / 2;
	        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
	        System.out.println("Area of Triangle: " + area);
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        // Creating an instance of Triangle
	        Program27 triangle = new Program27();
	        triangle.printPerimeter(); // Output: Perimeter of Triangle: 12.0
	        triangle.printArea(); // Output: Area of Triangle: 6.0
	    }
	}

	public void printPerimeter() {
		// TODO Auto-generated method stub
		
	}

	public void printArea() {
		// TODO Auto-generated method stub
		
	}

}
