package Moduel2;

import java.util.Scanner;

public class Program15 
{

	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        String originalString = scanner.nextLine();

        System.out.print("Enter the string to concatenate: ");
        String stringToConcatenate = scanner.nextLine();

        String concatenatedString = originalString + stringToConcatenate;

        System.out.println("Concatenated String: " + concatenatedString);

        scanner.close();
    }
}
