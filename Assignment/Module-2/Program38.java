package javaprogram;
/*  W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch block. try {
try
{//code}
catch (Exception e)
{//code}
catch (Exception e)
{//code} */
public class Program38 
{
    public static void main(String[] args) 
    {
        try 
        {
            try 
            {
                int[] a = new int[5];
                
                a[5] = 30 / 0;
            } 
            catch (ArrayIndexOutOfBoundsException e) 
            {
                System.out.println("Inner Catch - Array Index Out of Bounds Exception: " + e.getMessage());
            }
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Outer Catch - Arithmetic Exception: " + e.getMessage());
        } catch (Exception e) {
            
            System.out.println("Outer Catch - Error: " + e.getMessage());
        }

        System.out.println("Program execution completed.");
    }
}
