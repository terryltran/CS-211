package classAssignments;
import java.io.*;
import java.util.*;

public class People211 {
	static HashSet <String> Mexico = new HashSet <>();
	static HashSet <String> Cuba = new HashSet <>();
	static HashSet <String> Jamaica = new HashSet <>();
	
	public static void read(String file) throws FileNotFoundException {
		Scanner input = new Scanner (new File (file));
		
		while (input.hasNext()) {
			String name = input.next();
			String country = input.next();
			if (country.equalsIgnoreCase("Mexico")) {
				Mexico.add(name);
			} else if (country.equalsIgnoreCase("Cuba")) {
				Cuba.add(name);
			} else if (country.equalsIgnoreCase("Jamaica")) {
				Jamaica.add(name);
			}
		}
		
	}

	public static HashSet <String> singleCountry (HashSet <String> country){
		HashSet<String> people = new HashSet <String> (country);
		return people;
	}
	public static HashSet <String> TwoCountries (HashSet <String> c1, HashSet <String> c2, HashSet <String> c3){
		HashSet<String> people = new HashSet <String>();
		
		people.addAll(Mexico);
		people.addAll(Cuba);
		people.addAll(Jamaica);
		
		people.retainAll(c1);
		people.retainAll(c2);
		people.removeAll(c3);
		return people;
	}
	public static HashSet <String> oneCountry (HashSet<String> c1, HashSet <String> c2){
		HashSet <String> people = new HashSet <String>();
		
		people.addAll(Mexico);
		people.addAll(Cuba);
		people.addAll(Jamaica);
		
		people.removeAll (c1);
		people.removeAll (c2);
		
		return people;
	}
	public static HashSet <String> anyCountry(){
		HashSet <String> people = new HashSet <String>();
		people.addAll(Mexico);
		people.addAll(Cuba);
		people.addAll(Jamaica);
		
		return people;
	}
	public static HashSet <String> all (){
		HashSet <String> people = new HashSet <String> ();
		people.addAll(Cuba);
		people.addAll(Mexico);
		people.addAll(Jamaica);
		
		people.retainAll(Cuba);
		people.retainAll(Mexico);
		people.retainAll(Jamaica);
		
		return people;
	}
}