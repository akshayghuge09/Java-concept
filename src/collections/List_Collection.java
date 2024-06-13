package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_Collection {

	public static void main(String[] args) {

		List l = new ArrayList();
		l.add(12);
		l.add("hello");
		l.add(12.12f);
		l.add(12.565);
		l.add(null);
		System.out.println(l.isEmpty());
		System.out.println(l.size());
		System.out.println(l.contains(12));
		System.out.println(l.indexOf(null));
		System.out.println(l.get(3));
		for(Object o : l)
		{
			System.out.println(o);
		}
		l.removeAll(l);
		System.out.println(l.isEmpty());
		
	}

}
