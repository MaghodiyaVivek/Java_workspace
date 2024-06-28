package Moduel2;
//We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Create an object for each of the two classes and print the percentage of marks for both the students.

public class Program31 
{

	
	abstract class Marks {
	   
	    abstract double getPercentage();
	}

	class A extends Marks 
	{
	    private int marks1, marks2, marks3;

	    
	    public A(int marks1, int marks2, int marks3) 
	    {
	        this.marks1 = marks1;
	        this.marks2 = marks2;
	        this.marks3 = marks3;
	    }

	    @Override
	    double getPercentage() 
	    {
	        int totalMarks = marks1 + marks2 + marks3;
	        return (totalMarks / 3.0);
	    }
	}

	class B extends Marks 
	{
	    private int marks1, marks2, marks3, marks4;

	    
	    public B(int marks1, int marks2, int marks3, int marks4) {
	        this.marks1 = marks1;
	        this.marks2 = marks2;
	        this.marks3 = marks3;
	        this.marks4 = marks4;
	    }

	   
	    @Override
	    double getPercentage() 
	    {
	        int totalMarks = marks1 + marks2 + marks3 + marks4;
	        return (totalMarks / 4.0);
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        
	        Marks studentA = new A(85, 90, 80);
	        System.out.println("Percentage of marks for Student A: " + studentA.getPercentage() + "%");

	        Marks studentB = new B(75, 80, 70, 85);
	        System.out.println("Percentage of marks for Student B: " + studentB.getPercentage() + "%");
	    }
	}

}
