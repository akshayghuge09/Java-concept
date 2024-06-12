package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MainApp {

	public static void main(String[] args) {

// example of set collection

		Set<String> s = new HashSet<>();
		s.add("akshay");
		s.add("rushi");
		s.add("karan");
		s.add("ram");
		System.out.println(s.size());
		System.out.println(s);

		Iterator<String> itr = s.iterator();
		while (itr.hasNext()) {
			// System.out.println("using iterator "+itr.next());
			String sr = itr.next();
			if (sr.equals("karan")) {
				itr.remove();
			}
		}
		System.out.println(s);

//Example of set with user define class

		Set<Mobile> ms = new HashSet<>();
		ms.add(new Mobile(1234, "samsung", 20000));
		ms.add(new Mobile(1234, "samsung", 20000));
		ms.add(new Mobile(1235, "samsung", 20000));
		ms.add(new Mobile(1234, "samsung", 20000));

		System.out.println(ms.size());
		System.out.println(ms.toString());

//Example of treeSet and see the difference

		System.out.println(
				"check differences\n--------------------------------------------------------------------------");
		Set<Mobile> ms1 = new TreeSet<>();
		ms1.add(new Mobile(1234, "samsung", 20000));
		ms1.add(new Mobile(1134, "onepluse", 20000));
		ms1.add(new Mobile(1235, "iphone", 20000));
		ms1.add(new Mobile(1224, "samsung m31", 20000));

		for (Mobile m : ms1) {
			System.out.println(m.toString());
		}

		// Examples of List interface

		List<Mobile> lst = new ArrayList();
//		once we create list of parent class
//		we can store the objects of derived class		
		System.out.println("before add " + lst.size());

//			lst.add(10);
//			lst.add("aksahy");
//			lst.add(10.2);
		lst.add(new Mobile(8, "red", 20000));

		System.out.println("after add " + lst.size());
//			lst.remove(0);
		System.out.println("after remove " + lst.size());
		// System.out.println(lst.get(0));
		// System.out.println(lst.get(2));
		for (int index = 0; index < lst.size(); index++) {

			Object ref = lst.get(index);
			((Mobile) ref).getClass();
			if (ref instanceof Mobile) {
				System.out.println(((Mobile) ref).getClass());
			}

		}
		for (Mobile mobile : lst) {
			System.out.println(mobile);
		}

		List lst1 = new ArrayList<>();
		lst1.add(10);
		lst1.add(11);
		lst1.add(12);
		lst1.add(13);
		lst1.add(14);
		lst1.add(15);
//			System.out.println(lst1.size());
		// option 1
		// for (int i = 0; i < lst1.size(); i++) {
		// System.out.println(lst1.get(i));
		// }
		// option 2
		// System.out.println(lst1);
		// option 3
		// for ( Object x : lst1) {
//				System.out.println(x);
//			}
		lst1.add(3, 12.5);
		lst1.add(lst1.size(), 16);
		System.out.println("after insertion  " + lst1);
		int ch;
		do {
			System.out.println("enter the choice");
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter the iemi no");
				int x = sc.nextInt();
				System.out.println("Enter the brand");
				String s1 = sc.next();
				System.out.println("Enter the prices");
				int z = sc.nextInt();
				Mobile m = new Mobile();
				m.iemi = x;
				m.brand = s1;
				m.prices = z;

				lst.add(m);
				for (Object object : lst) {
					System.out.println(object);
				}
				break;
			case 2:
				System.out.println("enter the position which you have to delelet");
				int y = sc.nextInt();
				lst1.remove(y);
				System.out.println("after add  " + lst1);
				break;

			}

		} while (ch != 0);

	}

}
