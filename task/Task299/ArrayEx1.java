package Task299;

public class ArrayEx1 
{

	public static void main(String[] args) 
	{
				//length fixed
				int a[] = new int[10];
					
				a[0] = 10;
				a[1] = 20;
				a[2] = 30;
				a[3] = 40;
				a[4] = 50;
				a[5] = 60;
				
				
				
				for(int i=0;i<10;i++)
				{
					System.out.println(a[i]);
				}
				
				//just pass index in array
				System.out.println(a[3]);	
	}
}
