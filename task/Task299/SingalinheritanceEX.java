package Task299;

public class SingalinheritanceEX 
{

	// Singal inheritance ek mathi begaa ma jai Ex :- a  mathhi  b  ma
	
	class A
	{
		void a1()
		{
			System.out.println("A1 Accessed");
		}
	}
	class B extends A
	{
		void b1()
		{
			System.out.println("B1 Accessed");
		}
	}

	public class SingleInEx 
	{
		public static void main(String[] args)
		{
			
			
			B b1 =new B();
			
			b1.a1();
			b1.b1();
			
		}
	}
}
