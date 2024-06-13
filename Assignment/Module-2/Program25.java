package Moduel2;

//Create a class named 'Member' having the following members:
//1. Data members
//2. Name
//3. Age
//4. Phone number
//5. Address
//6. Salary

//It also has a method named 'printSalary' which prints the salary of the members.
public class Program25 
{
	public class Member {
	    // Data members
	    private String name;
	    private int age;
	    private String phoneNumber;
	    private String address;
	    private double salary;

	    // Constructor to initialize the Member object
	    public Member(String name, int age, String phoneNumber, String address, double salary) {
	        this.name = name;
	        this.age = age;
	        this.phoneNumber = phoneNumber;
	        this.address = address;
	        this.salary = salary;
	    }

	    // Method to print the salary of the member
	    public void printSalary() {
	        System.out.println("Salary of " + name + " is $" + salary);
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	        // Create a Member object
	        Member member1 = new Member("John Doe", 30, "123-456-7890", "123 Main St", 50000.0);
	        
	        // Print the salary using the printSalary method
	        member1.printSalary();
	    }
	}

	

}
