package collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CURD_OperationOnHashTable {

	public static void main(String[] args) {

		Map product = new Hashtable();

		int ch;
		do {
			System.out.println("1.Add product info ");
			System.out.println("2.Display all products");
			System.out.println("3.retrieve an product by product id");
			System.out.println("4.remove product from the list");
			System.out.println("0.exit");
			System.out.println("*************************************************************");
			System.out.println("Enter your choice");
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("enter no.of product to be added");
				int n = sc.nextInt();
				for (int i = 0; i < n; i++) {
					System.out.println("enter the product id: ");
					int p_id = sc.nextInt();
					System.out.println("enter the product name");
					String p_Name = sc.next();
					product.put(p_id, p_Name);
				}
				break;
			case 2:
				System.out.println("product list with id");
				Set<Integer> ks = product.keySet();
				for (int k : ks) {
					System.out.println(k + " = " + product.get(k));
					
				}
				System.out.println("/////////////////////////////////////////////////////////////");
				break;
			case 3:
				System.out.println("eneter the product name to be search: ");
				String p = sc.next();
				Set<Integer> ks1 = product.keySet();
				int flag = 0;
				for (int k : ks1) {
					if (p.equals(product.get(k))) {
						System.out.println(k + " = " + product.get(k));
						flag = 1;
					}
				}
				if (flag == 1) {
					System.out.println("product is found");

					System.out.println("/////////////////////////////////////////////////////////////");
				} else {
					System.out.println("product is not found");
				}
				break;
			case 4:
				System.out.println("enter the product id to be remove");
				int remove = sc.nextInt();
				product.remove(remove);
				System.out.println("succssfuly removed");

			}

		} while (ch != 0);
	}

}
