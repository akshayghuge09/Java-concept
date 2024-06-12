package StreamAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class MainApp {
	public static void main(String[] args) {

// create list using static method		
		List<Person> people = Person.create();

// Get all person name using stream
		System.out.println("Get all person name using stream");
		people.stream().forEach(obj -> System.out.println(obj.getName()));

		System.out.println(
				"------------------------------------------------------------------------------------------------------");

// Add constrain using stream and see how to create streamAPI to filter the list 

		System.out.println("List of males above 20");
		people.stream().filter(ref -> ref.getGender().equals("M") && ref.getAge() > 20)
				.forEach(obj -> System.out.println(obj.getName()));

		System.out.println(
				"------------------------------------------------------------------------------------------------------");

// Normal way to filter

		System.out.println("Normal way to filter List of males above 20");

		for (Person p : people) {
			if (p.getGender().equals("M") && p.getAge() > 20) {
				System.out.println(p.getName());
			}
		}

		System.out.println(
				"------------------------------------------------------------------------------------------------------");

//average age of males in collection

//next level streamAPI
		System.out.println("average age of males in list\n");
		double avg = people.stream().filter(ref -> ref.getGender().equals("M")).mapToInt(Person::getAge).average()
				.getAsDouble();
		System.out.println(avg);

//advanced

		System.out.println(
				"------------------------------------------------------------------------------------------------------");

		HashMap<String, List<Person>> group_acc_name = (HashMap<String, List<Person>>) people.stream()
				.collect(Collectors.groupingBy(Person::getName));

		for (String ref : group_acc_name.keySet()) {
			System.out.println("Name " + ref + " occures " + group_acc_name.get(ref).size());
		}

		System.out.println(
				"--------------------------------------------------------------------------------------------------");

//Noramal way

		System.out.println("Normal way");

		HashMap<String, List<Person>> filtereddata = new HashMap();
		List<Person> temp = null;
		Set<String> temp1 = new HashSet();
		for (Person p : people) {
			temp1.add(p.getName());
		}
		for (String t : temp1) {
			temp = new ArrayList();

			for (Person p : people) {
				if (t.equals(p.getName())) {

					temp.add(p);
				}
			}
			filtereddata.put(t, temp);
		}
		for (Entry<String, List<Person>> entry : filtereddata.entrySet()) {
			String key = entry.getKey();
			List val = entry.getValue();
			System.out.println(key + " " + val.size());

		}
	}

}
