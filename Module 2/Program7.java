package Moduel2;

import java.util.Scanner;

public class Program7 
{

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        
        if (number <= 0) 
        {
            System.out.println("Please enter a positive integer.");
        } 
        else 
        {
            int count = 0;
            while (number > 0) 
            {
               
                number /= 10;
                count++;
            }
            System.out.println("Number of digits: " + count);
        }
	}
}
