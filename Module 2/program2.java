package Moduel2;

import java.util.Scanner;

public class program2 
{

	public static void main(String[] args) 
	{
	
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a single character: ");
        String userInput = scanner.next();
        
        if (userInput.length() != 1 || !Character.isLetter(userInput.charAt(0))) 
        {
            System.out.println("Error: Please enter a single letter.");
        } 
        else 
        {
            
        char character = userInput.charAt(0);
        char lowercaseChar = Character.toLowerCase(character);
        }   
            
        char lowercaseChar = 0;
		if (lowercaseChar == 'a' || lowercaseChar == 'e' || lowercaseChar == 'i' || lowercaseChar == 'o' || lowercaseChar == 'u') 
        {
                System.out.println("Vowel");
            
        } 
        else 
        {
                System.out.println("Consonant");
            
        }
        
        
    }

	
}
