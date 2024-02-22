package Task209;

import java.util.Scanner;

public class Task3
{

	
public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter c to calculate area of circle");
        System.out.println("Enter s to calculate area of trangle");
        System.out.println("Enter r to calculate area of rectangle");
        System.out.print("Enter your choice: ");
        char choice = in.next().charAt(0);
        
        switch(choice) {
            case 'c':
                System.out.print("Enter radius of circle: ");
                double r = in.nextDouble();
                double ca = (22 / 7.0) * r * r;
                System.out.println("Area of circle = " + ca);
                break;
                
            case 't':
                System.out.print("Enter side of trangle: ");
                double side = in.nextDouble();
                double ta = side * side;
                System.out.println("Area of square = " + ta);
                break;
                
            case 'r':
                System.out.print("Enter length of rectangle: ");
                double l = in.nextDouble();
                System.out.print("Enter breadth of rectangle: ");
                double b = in.nextDouble();
                double ra = l * b;
                System.out.println("Area of rectangle = " + ra);
                break;
                
            default:
                System.out.println("Wrong choice!");
        }
    }
}
