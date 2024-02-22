package Task2510;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;


public class TitleIcon 
{

	
	public TitleIcon() 
	{
		// TODO Auto-generated constructor stub
		Frame f=new Frame();     
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\image//1.png");    
		
		f.setIconImage(icon);    
		f.setLayout(null);     
		f.setSize(600,600);     
		f.setVisible(true);     
		
	}
	
	public static void main(String[] args)
	{
		new TitleIcon();
	}
}
