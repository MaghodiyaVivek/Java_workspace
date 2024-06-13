//W.A.J.P to check whether a given string ends with the contents of another string.
//"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True 

package Moduel2;
import java.util.Scanner;

public class Program17 
{

	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();

        System.out.print("Enter the string to check for ending: ");
        String endsWithString = scanner.nextLine();
        
        boolean endsWith = originalString.endsWith(endsWithString);
        System.out.println("\"" + originalString + "\" ends with \"" + endsWithString + "\"? " + endsWith);

        scanner.close();
    }
}
