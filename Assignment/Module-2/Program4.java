package Moduel2;

import java.util.Scanner;

public class Program4 
{

	public static void main(String[] args) 
	{
	
		Scanner scanner = new Scanner(System.in);
        int sum = 0;

        
        for (int i = 1; i <= 5; i++) 
        {
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();
            sum += num;
        }

        
        double average = (double) sum / 5;
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
	}



}
