package Task2510;

import java.awt.*;
import java.awt.Graphics;

import javax.swing.*;

public class Displayimage extends Canvas
{
	
	@Override
	public void paint(Graphics g) 
	{
		// TODO Auto-generated method stub
		//super.paint(g);
		  Toolkit t=Toolkit.getDefaultToolkit();  
		  Image i=t.getImage("D:\\image//vivek1.jpeg");  
g.drawImage(i,500,500,500,500,this)		;
	}
	
	public static void main(String[] args) 
	{
		Displayimage m=new Displayimage();  
	 	JFrame f=new JFrame(); 
        f.add(m);  
        f.setSize(700,700);  
        f.setVisible(true);  
	}
}
