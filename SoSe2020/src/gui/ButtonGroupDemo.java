package gui;

import java.awt.*;
import javax.swing.*;


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
	
		
		
		
	}

	private JPanel p1init()
	{
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		JPanel p6 = new JPanel();
		
		//Radiobutton
		JRadioButton eins = new JRadioButton("");
		JRadioButton zwei = new JRadioButton("");
		JRadioButton drei = new JRadioButton("");
		drei.setSelected(true);
		ButtonGroup gruppe = new ButtonGroup();
		gruppe.add(eins);
		gruppe.add(zwei);
		gruppe.add(drei);
		
		
		
		//ungrupperte JRadioButton
		JRadioButton ungr1 = new JRadioButton("");
		JRadioButton ungr2 = new JRadioButton("");
		JRadioButton ungr3 = new JRadioButton("");
		ungr1.setSelected(true);
		
		
		
		//JCheckBox
		JCheckBox one , two , three;
		one = new JCheckBox("");
		two = new JCheckBox("");
		three = new JCheckBox("");
		ButtonGroup gruppe2 = new ButtonGroup();
		one.setSelected(true);
		gruppe2.add(one);
		gruppe2.add(two);
		gruppe2.add(three);
		
		//ungrupperte JCheckBox
		JCheckBox ungrj1 , ungrj2 , ungrj3;
		ungrj1 = new JCheckBox("");
		ungrj2 = new JCheckBox("");
		ungrj3 = new JCheckBox("");
		ungrj3.setSelected(true);
		
		
	
		//Label
		JLabel label = new JLabel("Gruppiert: ");
		
		//label.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		label.setFont(new Font(Font.SANS_SERIF,Font.BOLD, 18));
		
		JLabel label2 = new JLabel("Nicht Gruppiert: ");
		label2.setFont(new Font(Font.SANS_SERIF,Font.BOLD, 18));
		
		
		p1.add(label);
		p2.add(eins);
		p2.add(zwei);
		p2.add(drei);
		p3.add(one);
		p3.add(two);
		p3.add(three);
		p4.add(label2);
		p5.add(ungr1);
		p5.add(ungr2);
		p5.add(ungr3);
		p6.add(ungrj1);
		p6.add(ungrj2);
		p6.add(ungrj3);
		
		
		this.getContentPane().add(p1);
		this.getContentPane().add(p2);
		this.getContentPane().add(p3);
		this.getContentPane().add(p4);
		this.getContentPane().add(p5);
		this.getContentPane().add(p6);
		
		return p1;
	}

	
	/*/Was fällt bei beim Wechseln der Auswahl auf?
	 * bei den grupperten Buttons kann man nur eins auswählen , also nur 
	 * eine der drei buttons kann ausgewählt sein. Bei den ungrupperten
	 * Buttons kann man alle 3 als ausgewählt kennzeichnen , also 
	 * mehrere als nur eine auswahl.
	 */
	

}
