package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CRUD_operationsOnList {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		int ch;
		do {
		System.out.println("1.Add color into Arraylist ");
		System.out.println("2.Find color by index");
		System.out.println("3.Insert an color at the first position");
		System.out.println("4.update specific array color by given color");
		System.out.println("5.Remove element from given position");
		System.out.println("6.Search color");
		System.out.println("7.Reverse colors of an arraylist");
		System.out.println("8.Sort colors");
		System.out.println("0.exit");
		System.out.println("*************************************************************");
		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
		ch = sc.nextInt();
		

			switch (ch) {
			case 1:
				System.out.println("Enter the color");
				String color = sc.next();
				l.add(color);
				break;
			case 2:

				System.out.println("Enter the index");
				int i = sc.nextInt();
				if (i >= 0 && i < l.size()) {
					System.out.println(l.get(i));
				} else {
					System.out.println("invalid index");
				}
				break;
			case 3:
				System.out.println("Enterm color at frist position");
				String color1 = sc.next();
				l.add(0, color1);
				break;
			case 4:
				System.out.print("Enter the index to update color: ");
				int index = sc.nextInt();

				if (index >= 0 && index < l.size()) {
					System.out.print("Enter the new element: ");
					String newcolor = sc.next();
					l.set(index, newcolor);
					System.out.println("Element at index " + index + " updated. Updated ArrayList: " + l);
				} else {
					System.out.println("Invalid index");
				}
				break;
			case 5:
				System.out.print("Enter the index to remove element: ");
				int i2 = sc.nextInt();

				if (i2 >= 0 && i2 < l.size()) {
					String removedElement = l.remove(i2);
					System.out.println("Element at index " + i2 + " removed. Removed element: " + removedElement);
					System.out.println("Updated ArrayList: " + l);
				} else {
					System.out.println("Invalid index.");
				}
			case 6:
				System.out.print("Enter the element to search: ");
				String color3 = sc.next();

				int i3 = l.indexOf(color3);
				if (i3 != -1) {
					System.out.println("Element found successfuly");
				} else {
					System.out.println("Element not found in ArrayList.");

				}
				break;
			case 7:
				Collections.reverse(l);
				System.out.println("Reversed ArrayList: " + l);
				break;
			case 8:
			Collections.sort(l);
			for (String string : l) {
				System.out.println(string);
			}
				

			default:
				break;
			}

		} while (ch != 0);

		
	}

}
