package javaprogram;
/* W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero exception and another one is to handle
ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0; */

public class Program37 {
	
    public static void main(String[] args) 
    {
        int[] a = new int[5];
        
        try {
            
            a[5] = 30 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Array Index Out of Bounds Exception: " + e.getMessage());
        } catch (ArithmeticException e) {
         
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (Exception e) {
           
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program execution completed.");
    }
}
