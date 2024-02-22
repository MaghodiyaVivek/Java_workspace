package Task1310;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Task implements ActionListener
{
	//Declare
	
	JFrame frame;
	
	JButton btn1,btn2,btn3,btn4;
	
	
	public Task() 
	{
		
		//Initialize
		
		frame = new JFrame();
	
			
		btn1 = new JButton("Insert");
		btn1.setBounds(10, 20, 89, 23);
		
		btn2 = new JButton("Update");
		btn2.setBounds(100, 176, 89, 23);
		
		btn3 = new JButton("View");
		btn3.setBounds(190, 176, 89, 23);
		
		btn4 = new JButton("Delete");
		btn4.setBounds(270, 176, 89, 23);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		//ActionListener
		
		
		/*
		 * btn1 = new JButton("Button 1"); btn1.setBounds(10, 176, 89, 23);
		 * 
		 * btn2 = new JButton("Button 2"); btn2.setBounds(100, 176, 89, 23);
		 * 
		 * btn3 = new JButton("Button 3"); btn3.setBounds(190, 176, 89, 23);
		 * 
		 * btn4 = new JButton("Button 4"); btn4.setBounds(270, 176, 89, 23);
		 */
		
		
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.setSize(500,500);
		//frame.setLayout(null);
		//frame.setVisible(true);
		
		
		
		
	}
	
	public static void main(String[] args) 
	{
		new Task();
	}

	//@Override
	public void actionPerformed(ActionEvent e) 
	{
			
	}
	
}