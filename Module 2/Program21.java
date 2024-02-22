//Create a class named 'Print Number' to print various numbers of different data types
//by creating different methods with the same name 'printn' having a parameter for
//each data type. 

package Moduel2;

public class Program21 
{
	public void printn(int num) 
	{
        System.out.println("Printing integer: " + num);
    }

    public void printn(double num) 
    {
        System.out.println("Printing double: " + num);
    }

    public void printn(float num) 
    {
        System.out.println("Printing float: " + num);
    }

    public void printn(long num) 
    {
        System.out.println("Printing long: " + num);
    }

    public void printn(short num) 
    {
        System.out.println("Printing short: " + num);
    }

    public void printn(byte num) 
    {
        System.out.println("Printing byte: " + num);
    }

    public void printn(char ch) 
    {
        System.out.println("Printing character: " + ch);
    }

    public void printn(boolean bool) 
    {
        System.out.println("Printing boolean: " + bool);
    }

    public static void main(String[] args) 
    {
        Program21 printer = new Program21();
        
        printer.printn(10);
        printer.printn(3.14);
        printer.printn(2.5f);
        printer.printn(100000000000L);
        printer.printn((short) 5);
        printer.printn((byte) 1);
        printer.printn('A');
        printer.printn(true);
    }
}
