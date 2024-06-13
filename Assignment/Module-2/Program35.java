package javaprogram;
//W.A.J. P to demonstrate try catch block,

import java.util.Scanner;

public class Program35 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers to divide:");

        try {
            
            int numerator = scanner.nextInt();
            int denominator = scanner.nextInt();

            
            int result = divideNumbers(numerator, denominator);

           
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            
            System.out.println("Error: Division by zero or other arithmetic error occurred.");
        } catch (Exception e) {
            
            System.out.println("Error: " + e.getMessage());
        } finally {
            
            scanner.close();
        }

        System.out.println("Program execution completed.");
    }

    public static int divideNumbers(int numerator, int denominator) {
        return numerator / denominator;
    }
}
