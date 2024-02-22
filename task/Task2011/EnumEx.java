package Task2011;

enum Student
{
	Vivek(10), Ram(20), Kishan(30), manoj(15);
	
	int age;
	
	public static int getAge() 
	{ 
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	
	private Student(int age) 
	{
		// TODO Auto-generated constructor stub
		this.age = age;
	}
	
}

public class EnumEx 
{
	

	public static void main(String[] args) 
	{
	
		System.out.println(Student.Sam.getAge());
		
	}

}
