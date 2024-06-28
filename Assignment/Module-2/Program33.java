package javaprogram;

	import java.util.Scanner;



/*We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively. Create an object of class 'Area' and call all the three methods. I3. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
Marks Grade
91-100
AA
81-90
AB
71-80
BB
61-70
BC
51-60
CD
41-50 DD
40 Fail*/



	public class Program33 
	{
	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your marks (out of 100): ");
	        int marks = scanner.nextInt();

	        System.out.println("Your grade is: " + getGrade(marks));
	    }

	    
	    
	    public static String getGrade(int marks) 
	    {
	        if (marks >= 91 && marks <= 100) {
	            return "AA";
	        } else if (marks >= 81 && marks <= 90) {
	            return "AB";
	        } else if (marks >= 71 && marks <= 80) {
	            return "BB";
	        } else if (marks >= 61 && marks <= 70) {
	            return "BC";
	        } else if (marks >= 51 && marks <= 60) {
	            return "CD";
	        } else if (marks >= 41 && marks <= 50) {
	            return "DD";
	        } else if (marks <= 40) {
	            return "Fail";
	        } else {
	            return "Invalid marks entered";
	        }
	    }
	}


