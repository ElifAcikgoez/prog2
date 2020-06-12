package gui;

import java.awt.BorderLayout;
import java.awt.Color;


import javax.swing.*;

@SuppressWarnings("serial")
public class AddElementsWindow extends JFrame
{
	public AddElementsWindow()
	{
		this.setLocation(200, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 150);
		
		
		this.setTitle("Elemente hinzufügen");
		this.setVisible(true);
		this.getContentPane().setBackground(Color.CYAN);
		
		JPanel oben = obeninit();
		this.getLayeredPane().add(oben);
		
		this.getContentPane().add(oben, BorderLayout.NORTH);
		
	}

	

	private JPanel obeninit()
	{
		JPanel oben = new JPanel();
		
		oben.setBackground(Color.YELLOW);
		JTextField input = new JTextField(10);
		JButton button = new JButton("add");
		JButton button1 = new JButton("remove");
		
		
		
		oben.add(input);
		oben.add(button);
		oben.add(button1);
		
		return oben;
	}
	
	
	
}
