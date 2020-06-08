package uebung07;

import java.util.*;

public class SetOperations
{
	Set<Integer> numbers1;
	Set<Integer> numbers2;
	Set<Integer> both;
	
	TreeSet<Integer> t1 = new TreeSet<Integer>(numbers1);
	TreeSet<Integer> t2 = new TreeSet<Integer>(numbers2);
	TreeSet<Integer> t3 = new TreeSet<Integer>(both);
	
	
	
	public void fill()
	{
		Random r = new Random();
		for ( int i =0 ; i<100 ; i++)
		{
			numbers1.add( r.nextInt(0)+100);
			numbers2.add( r.nextInt(0)+100);
		}
		
	}
	
	
	public void fillBothUnion()
	{
	 numbers1.addAll(numbers2);
	 both = numbers1;
	}
	
	//4., 5. und 6. aufgabe komme ich nicht weiter 
	
	
}
