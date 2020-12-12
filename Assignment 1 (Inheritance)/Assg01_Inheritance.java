/*Assignment 1 - Inheritance
 * Terry Tran - terry.tran@bellevuecollege.edu
 *  Student ID: 950684347
 * Date: 1/8/2019 (WINTER)
 * This program the extended version of the random scanner (newRandom) and prints out all of the new and copied methods.
 */
package classAssignments;
import java.util.*;

public class Assg01_Inheritance {

	public static void main(String[] args) {
		newRandom rand = new newRandom ();
		System.out.println();
		System.out.println("nextInt(20,30)");
		for (int i = 0; i<7; i++) {
			int random2 = rand.nextInt2(20, 30); 
			System.out.println(random2);
		}
		System.out.println();
		System.out.println("nextDouble():");
		for (int i = 0; i<7; i++) {
			double digit = rand.nextDouble(); 
			System.out.println(digit);
		}
		
		System.out.println();
		System.out.println("nextEven(10, 30):");
		for (int i = 0; i<7; i++) {
			int even1 = rand.nextEven(20, 30); 
			System.out.println(even1);
		}
		
		System.out.println();
		System.out.println("nextOdd(10, 30):");
		for (int i = 0; i<7; i++) {
			int odd1 = rand.nextOdd(20, 30); 
			System.out.println(odd1);
		}
		
		System.out.println();
		System.out.println("nextCharCap():");
		for (int i = 0; i<7; i++) {
			char cap = rand.nextCharCap();
			System.out.println(cap);
		}
		System.out.println();
		System.out.println("nextCharLow():");
		for (int i = 0; i<7; i++) {
			char low = rand.nextCharLow();
			System.out.println(low);
		}
		System.out.println();
		System.out.println("nextChar('Y','C'):");
		for (int i = 0; i<7; i++) {
			char letters = rand.nextChar('Y', 'C');
			System.out.println(letters);
		} 
		
		System.out.println();
		System.out.println("nextWord(5)");
		for (int i =0; i <7; i++) {
			String random3 = rand.nextWord(5);
			System.out.println(random3);
		}
		System.out.println();
		System.out.println("nextColor()");
		for (int i=0; i<7; i++) {
			System.out.println(rand.nextColor());
		}
	}
	
}

