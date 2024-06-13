//Create a class to print an integer and a character with two methods having the same
//name but different sequence of the integer and the character parameters. For
//example, if the parameters of the first method are of the form (int n, char c), then
//that of the second method will be of the form (char c, int n). 

package Moduel2;

public class Program22 
{

	 public void print(int n, char c) 
	 {
	        System.out.println("Printing integer followed by character: " + n + ", " + c);
	 }  


	    public void print(char c, int n) 
	    {
	        System.out.println("Printing character followed by integer: " + c + ", " + n);
	    }

	    public static void main(String[] args) 
	    {
	        Program22 printer = new Program22();

	        printer.print(5, 'A');
	        printer.print('B', 10);
	    }
}
