package uebung07;

import java.util.*;



public class MainMapsSets
{

	public static void main(String[] args)
	{

		Map<String, String> m1 = new HashMap<>();
		Map<String, String> m2 = new HashMap<>();
		
		m1.put("A",	"Apple");
		m1.put("B",	"Ball");
		m1.put("C",	"Cat");
		m1.put("G",	"Gun");
		m1.put("I",	"Ice");
		m1.put("K",	"Kite");
		m1.put("M",	"Mat");
		
		m2.put("A",	"Ant");
		m2.put("B",	"Ball");
		m2.put("C",	"Cat");
		m2.put("G",	"Gun");
		m2.put("I",	"Ink");
		m2.put("M",	"Moon");
		
		
		//Set<String> s1 = new HashSet<>();
		System.out.println(getKeysWithSameKeyAndValue(m1, m2));
		
		
		
	}
	
	public static Set<String> getKeysWithSameKeyAndValue(Map<String, String> m1, Map<String,String> m2)
	{
		Set<String> s1 = new HashSet<>();
		for (Map.Entry<String, String> entry : m1.entrySet())
		{
			if (m2.containsKey(entry.getKey()))
			{
				if (entry.getValue().equals(m2.get(entry.getKey())))
				{
					s1.add(entry.getKey());
				}
			}
		}
	
	return s1;

	}

}
