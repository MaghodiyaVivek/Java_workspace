package Moduel2;

import java.util.Scanner;

public class Program1 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        
        double greatestNumber;
        if (num1 >= num2 && num1 >= num3) {
            greatestNumber = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            greatestNumber = num2;
        } else {
            greatestNumber = num3;
        }

        
        System.out.println("The greatest number is: " + greatestNumber);

      
	}

}
