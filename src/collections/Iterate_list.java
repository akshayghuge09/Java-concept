package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterate_list {

	public static void main(String[] args) {
		List <String> l = new ArrayList<String>();
		l.add("Red");
		l.add("yellow");
		l.add("orange");
		l.add("black");
		l.add("green");
		l.add("white");
		
		ListIterator<String> s = l.listIterator() ;
		while(s.hasNext())
		{
			System.out.println(s.next());
		}
				
		
		
	}
}
