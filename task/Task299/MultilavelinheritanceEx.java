package Task299;



class A1
{
	void a1()
	{
		System.out.println("A1 Accessed");
	}
}

class B1 extends A1
{
	void B1()
	{
		System.out.println("B1 Accesesd");
	}
	
}

class Cl extends B1
{
	void C1()
	{
		System.out.println("C1 Accesesd");
	}
}

class D1 extends C1
{
	void D1()
	{
		System.out.println("D1 Accesesd");
	}
	
}
public class MultilavelinheritanceEx 
{

	public static void main(String[] args)
	{
		
		
		D1 B1 =new D1();
		
		B1.D1();
		B1.D1();
		B1.D1();
		B1.D1();
	}
	
}
