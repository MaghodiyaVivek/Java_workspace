//W.A.J.P to get the character at the given index within the String. Original String =
//Tops Technologies! The character at position 0 is T, The character at position 10 is 0

package Moduel2;
import java.util.Scanner;

public class Program14 
{

	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();

        System.out.print("Enter the index to retrieve the character: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < originalString.length()) 
        {
            char characterAtIndex = originalString.charAt(index);
            System.out.println("Original String = " + originalString);
            System.out.println("The character at position " + index + " is " + characterAtIndex);
        } else {
            System.out.println("Invalid index!");
        }

        scanner.close();
    }
}
