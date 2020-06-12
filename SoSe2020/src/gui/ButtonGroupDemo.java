package gui;

import java.awt.BorderLayout;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class ButtonGroupDemo extends JFrame
{
	
	public ButtonGroupDemo()
	{
		this.setLocation(200, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);
		
		
		this.setTitle("ButtonGroupDemo");
		this.setVisible(true);
		
		this.getContentPane().setLayout(new GridLayout(8,1));
		
		JPanel p1 = p1init();
		JPanel p2 = p2init();
		//JPanel p3 = p3init();
		
		
	}

	

//	private JPanel p3init()
	//{
		//JPanel [] p3 = new JPanel[8];
		/*/
		JCheckBox one , two , three;
		one = new JCheckBox("");
		two = new JCheckBox("");
		three = new JCheckBox("");
		p3.add(one);
		p3.add(two);
		p3.add(three);

		//this.getContentPane().add(p3);/*/
		
		
		
		
		//return p3;
//	}



	private JPanel p2init()
	{
		JPanel p2 = new JPanel();
		JRadioButton eins = new JRadioButton("");
		JRadioButton zwei = new JRadioButton("");
		JRadioButton drei = new JRadioButton("");
		drei.setSelected(true);
		ButtonGroup gruppe = new ButtonGroup();
		gruppe.add(eins);
		gruppe.add(zwei);
		gruppe.add(drei);
		
		//eins.setLayout(new FlowLayout(FlowLayout.CENTER));
		p2.add(eins);
		p2.add(zwei);
		p2.add(drei);
		
		
		JCheckBox one , two , three;
		one = new JCheckBox("");
		two = new JCheckBox("");
		three = new JCheckBox("");
		p2.add(one);
		p2.add(two);
		p2.add(three);
		
	
		this.getContentPane().add(p2);
		
		return p2;
	}

	private JPanel p1init()
	{  setLayout(new BorderLayout());
		JPanel p1 = new JPanel();
		//p1.setLayout(new BorderLayout());
		JLabel label = new JLabel("Gruppiert : ");
		label.setFont(new Font(Font.SANS_SERIF,Font.BOLD, 18));
		//setLayout(new BorderLayout());
	
		//this.getContentPane().add(p1);
		this.getContentPane().add(label,BorderLayout.NORTH );
		
		
		return p1;
	}
	
	
	

}
