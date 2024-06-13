package Moduel2;
//Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'
//are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method by creating an object of each of the three classes.

public class Program30 
{

	abstract class Bank {
	    
	    abstract int getBalance();
	}

	class BankA extends Bank {
	   
	    private int balance = 100;

	    
	    @Override
	    int getBalance() {
	        return balance;
	    }
	}

	class BankB extends Bank {
	    
	    private int balance = 150;

	  
	    @Override
	    int getBalance() {
	        return balance;
	    }
	}

	class BankC extends Bank {
	   
	    private int balance = 200;

	    
	    @Override
	    int getBalance() {
	        return balance;
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        
	        Bank bankA = new BankA();
	        Bank bankB = new BankB();
	        Bank bankC = new BankC();
	        
	        System.out.println("Balance in Bank A: $" + bankA.getBalance()); // Output: Balance in Bank A: $100
	        System.out.println("Balance in Bank B: $" + bankB.getBalance()); // Output: Balance in Bank B: $150
	        System.out.println("Balance in Bank C: $" + bankC.getBalance()); // Output: Balance in Bank C: $200
	    }
	}

}
