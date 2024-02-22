package Task910;

import java.io.Serializable;

//serializable will serialize[outputstream] and deserialize[inputstream] data
public class Student implements Serializable
{
	int id;
	String firstname;
	
	public Student(int id,String firstname) 
	{
		
		this.id=id;
		this.firstname=firstname;
		
	}
}