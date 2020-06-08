package uebung07;

import java.util.*;

public class KleidungMain
{
	public static void main(String[] args)
	{
		Hose a = new Hose("Blau", "L");
		a.printFarbe();
		a.printGroesse();
		System.out.println(a.getWaschzeitInMinuten());
		
		
		Hose b = new Hose("Rot", "S");
		b.printFarbe();
		b.printGroesse();
		System.out.println(b.getWaschzeitInMinuten());
		
		Socke c = new Socke("Gelb","36");
		c.printFarbe();
		c.printGroesse();
		System.out.println(c.getWaschzeitInMinuten());
		
		
		List<Waschbar> waeschekorb = new LinkedList<>();
		fillList(waeschekorb);
		printList(waeschekorb);
		
		
		
	}
	
	static void fillList(List<Waschbar> list) 
	{ 
		Hose d = new Hose ("Gelb", "M");
		Hose e = new Hose ("Grau", "XS");
		Hose f = new Hose ("Orange", "S");
		
		Socke g = new Socke("Lila","40");
		Socke h = new Socke("Weiß","38");
		
		list.add(d);
		list.add(e);
		list.add(f);
		list.add(g);
		list.add(h);
		
	}
	
	static void printList(List<Waschbar> list) { Iterator<Waschbar> it = list.iterator(); while(it.hasNext()) {
		System.out.println(it.next()); }
		System.out.println("End of list"); }
	
	
	

	
	
}
