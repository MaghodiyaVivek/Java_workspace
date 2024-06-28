//Write a Java program that accepts an integer (n) and computes the value of
//n+nn+nnn. Input number: 5
//5 + 55 + 555 by Eclips

package Moduel2;
import java.util.Scanner;

public class Program11 
{

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer (n): ");
        int n = scanner.nextInt();

        // Compute the value of n + nn + nnn
        int nn = n * 10 + n;
        int nnn = n * 100 + nn;
        int result = n + nn + nnn;

        // Print the result
        System.out.println("Result of " + n + " + " + nn + " + " + nnn + " = " + result);

        scanner.close();
    }
}
