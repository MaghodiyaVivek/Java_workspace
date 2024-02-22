package Task910;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationEx 
{
	public static void main(String[] args) 
	{
		
		try 
		{
			Student s1 =new Student(73,"vivek");
			FileOutputStream fout = new FileOutputStream("D://vivekmaghodiya.txt");
			ObjectOutputStream out =new ObjectOutputStream(fout); 
			out.writeObject(s1);
		
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("Success");
	}
}