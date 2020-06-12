package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.*;

@SuppressWarnings("serial")
public class MouseListenerLesson extends JFrame
{

	JPanel mainPanel;
	JPanel [] subPanel;
		JButton [] buttons;
	int rows;
	int cols;

public MouseListenerLesson(int rows, int cols)

{	
this.rows= rows;
this.cols = cols;
	this.setLocation(200, 300);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(400, 400);
	this.setTitle("MouseListener Lesson");
	this.setVisible(true);

	
	
	JPanel centerPanel  = initCenterPanel();
	
	this.getContentPane().add(centerPanel);
	
	
}

private JPanel initCenterPanel()
{	Random r = new Random();
	mainPanel= new JPanel();
	
	mainPanel.setBackground(new Color (r.nextInt(256),r.nextInt(256), r.nextInt(256)));
	mainPanel.setLayout(new GridLayout(rows, cols));
	
	subPanel = new JPanel[rows*cols];
	for ( int i = 0 ; i< rows *cols; i++)
	{
		
		subPanel [i]= new JPanel();
		subPanel[i].setBackground(new Color (r.nextInt(256),r.nextInt(256), r.nextInt(256)));
		
		mainPanel.add(subPanel[i]);
		
		
		
	}
	 
	return mainPanel;
}







}
