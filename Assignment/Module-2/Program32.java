package javaprogram;
//Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! And is equal to 1*2*3*. *(n-1) *n. E.g.-
//4! = 1*2*3*4 = 24
//3! = 3*2*1 = 6
//2! = 2*1 = 2
//Also, 1! = 1
//0! = 0
public class Program32 
{

	public class FactorialProgram {
	    
	    public static long factorial(int n) 
	    {
	        if (n < 0) {
	            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
	        }
	        long result = 1;
	        for (int i = 1; i <= n; i++) {
	            result *= i;
	        }
	        return result;
	    }

	    public static void main(String[] args) 
	    {
	        int number = 4; 
	        long result = factorial(number);
	        System.out.println("Factorial of " + number + " is: " + result);
	    }
	}

}
