/* Assignment 3 - Visitor Pattern Analysis System 
 * Terry Tran - terry.tran@bellevuecollege.edu
 * Student ID: 950684347
 * Date: 1/25/2019 (WINTER)
 * This program is a Object Oriented Program that prints a list for different categories depending on the country or countries that they have visited.
 */
package classAssignments;
import java.io.*;
import java.util.*;
public class Assg03_HashSet {

	
	public static void print (HashSet <String> names, String title) {
		Iterator<String> m = names.iterator();
		System.out.println();
		System.out.println(title);
		int sum=0;
		while (m.hasNext()) {
			System.out.println(m.next());
			sum++;
	}
		System.out.println("Total: " + sum + " people");
	
}
	public static void main (String [] args) throws FileNotFoundException {
		People211 p = new People211 ();
		p.read("people.txt");
		print(p.singleCountry(p.Mexico), "People who have been to Mexico:");
		print(p.singleCountry(p.Cuba), "People who have been to Cuba:");
		print(p.singleCountry(p.Jamaica), "People who have been to Jamaica:");
		print(p.anyCountry(), "People who have been to Mexico, Cuba, or Jamaica:");
		print(p.all(), "People who have been to Mexico, Cuba, and Jamaica:");
		print(p.TwoCountries(p.Mexico, p.Cuba, p.Jamaica), "People who have been to Mexico and Cuba, but not Jamaica:");
		print(p.oneCountry(p.Mexico, p.Jamaica), "People who have been to Cuba, but not Mexico and Jamaica:");
		print(p.TwoCountries(p.Cuba, p.Jamaica, p.Mexico), "People who have been to Cuba and Jamaica, but not Mexico:");
	}


}
