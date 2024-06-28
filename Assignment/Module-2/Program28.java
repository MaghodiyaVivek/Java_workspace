package Moduel2;

// Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by user.
public class Program28 
{

	import java.util.Scanner;

	class Complex {
	    private double real;
	    private double imaginary;

	    
	    public Complex(double real, double imaginary) {
	        this.real = real;
	        this.imaginary = imaginary;
	    }


	    public Complex add(Complex other) {
	        double newReal = this.real + other.real;
	        double newImaginary = this.imaginary + other.imaginary;
	        return new Complex(newReal, newImaginary);
	    }

	    
	    public Complex subtract(Complex other) {
	        double newReal = this.real - other.real;
	        double newImaginary = this.imaginary - other.imaginary;
	        return new Complex(newReal, newImaginary);
	    }

	   
	    public Complex multiply(Complex other) {
	        double newReal = this.real * other.real - this.imaginary * other.imaginary;
	        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
	        return new Complex(newReal, newImaginary);
	    }



	    public void display() {
	        System.out.println(this.real + " + " + this.imaginary + "i");
	    }
	}

	public class Main 
	{
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the real part of the first complex number: ");
	        double real1 = scanner.nextDouble();
	        System.out.print("Enter the imaginary part of the first complex number: ");
	        double imaginary1 = scanner.nextDouble();
	        Complex complex1 = new Complex(real1, imaginary1);

	     
	        System.out.print("Enter the real part of the second complex number: ");
	        double real2 = scanner.nextDouble();
	        System.out.print("Enter the imaginary part of the second complex number: ");
	        double imaginary2 = scanner.nextDouble();
	        Complex complex2 = new Complex(real2, imaginary2);

	        
	        Complex sum = complex1.add(complex2);
	        Complex difference = complex1.subtract(complex2);
	        Complex product = complex1.multiply(complex2);

	        System.out.print("Sum: ");
	        sum.display();
	        System.out.print("Difference: ");
	        difference.display();
	        System.out.print("Product: ");
	        product.display();
	        
	        scanner.close();
	    }
	

	}
}
