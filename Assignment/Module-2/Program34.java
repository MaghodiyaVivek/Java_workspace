package javaprogram;
//Create a class named 'Shape' with a method to print "This is this is shape". Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print "This is rectangular shape" and "This is circular shape" respectively. Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.
public class Program34 
{

	
	class Shape {
	    
	    void printShape() {
	        System.out.println("This is shape");
	    }
	}


	class Rectangle extends Shape {
	    
	    void printRectangle() {
	        System.out.println("This is rectangular shape");
	    }
	}

	
	class Circle extends Shape {
	    
	    void printCircle() {
	        System.out.println("This is circular shape");
	    }
	}

	
	class Square extends Rectangle {
	    
	    void printSquare() {
	        System.out.println("Square is a rectangle");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        
	        Program34 square = new Program34();
	        
	       
	        square.printShape();
	        
	        
	        square.printRectangle();
	        
	       
	        square.printShape();
	    }
	}

	public void printShape() {
		// TODO Auto-generated method stub
		
	}

	public void printRectangle() {
		// TODO Auto-generated method stub
		
	}

}
