//W.A.J.P to compare a given string to the specified character sequence. Comparing
//topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false 

package Moduel2;
import java.util.Scanner;

public class Program16 
{

	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        String originalString = scanner.nextLine();

        boolean isEqual = originalString.equals("topsint.com");

        System.out.println("Comparing " + originalString + " and topsint.com: " + isEqual);

        scanner.close();
    }
}
