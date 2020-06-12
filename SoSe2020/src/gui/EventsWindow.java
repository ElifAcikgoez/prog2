package gui;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class EventsWindow extends JFrame
{
	public EventsWindow()
	{
		
	
	this.setLocation(200, 300);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(600, 350);
	this.setTitle("Aktionen behandeln");
	this.setVisible(true);
	
	
	 this.panelinit();
	
	
	
	
	}

	private JPanel panelinit()
	{
		JPanel panel = new JPanel();
		
		
		JButton b1 = new JButton("Window bigger");
		JButton b2 = new JButton("Window smaller");
		JButton b3 = new JButton("Text bigger");
		JButton b4 = new JButton("Text smaller");
		JButton b5 = new JButton("change color");
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		
		
		
		
		
		JLabel label= new JLabel("Text",JLabel.CENTER);
		label.setFont(new Font(Font.SANS_SERIF, Font.BOLD,18));
		
		
		label.setLayout(new BorderLayout());
		add(panel, BorderLayout.NORTH);
		
		add(label, BorderLayout.CENTER);

		this.getContentPane().add(label);
		
		return panel;
	}

}
