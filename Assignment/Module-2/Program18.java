//• W.A.J.P to check whether a given string starts with the contents of another string.
//Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts
//with Red? False I3. 

package Moduel2;
import java.util.Scanner;

public class Program18 
{

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();
 
        System.out.print("Enter the string to check for starting: ");
        String startsWithString = scanner.nextLine();

        boolean startsWith = originalString.startsWith(startsWithString);

        System.out.println("\"" + originalString + "\" starts with \"" + startsWithString + "\"? " + startsWith);

        scanner.close();
    }
}
