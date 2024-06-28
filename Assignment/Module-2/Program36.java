package javaprogram;

/*Take two numbers from the user and perform the division operation and handle Arithmetic Exception. O/P- Enter two numbers: 10 0
Exception in thread main java.lang.ArithmeticException:/ by zero*/

import java.util.Scanner;

public class Program36 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");

        try {
            
            int numerator = scanner.nextInt();
            int denominator = scanner.nextInt();

           
            int result = divideNumbers(numerator, denominator);

            
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
          
            System.out.println("Exception in thread main " + e.getClass().getName() + ": " + e.getMessage());
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
