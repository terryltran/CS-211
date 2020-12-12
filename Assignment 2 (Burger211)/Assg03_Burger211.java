/* Assignment 2 - Burger211
 * Terry Tran - terry.tran@bellevuecollege.edu
 * Student ID: 950684347
 * Date: 1/18/2019 (WINTER)
 * This program uses the Burger211 class to print out menus in 2 different countries. 
 */
package classAssignments;
import java.util.*;
import java.io.*;
public class Assg03_Burger211 {

	public static void main(String[] args) {
		Burger211 Hanoi = new VIETNAM ();
		Hanoi.promotion("Lunar New Year Promotion! 40% OFF!", 0.4);
		Hanoi.printMenu("Hanoi");
		Burger211 Saigon = new VIETNAM ();
		Saigon.promotion("Lunar New Year Promotion! 40% OFF!", 0.4);
		Saigon.printMenu("Saigon");
		
		Burger211 Bellevue = new USA ();
		Bellevue.printMenu("Bellevue");
		Burger211 Seattle = new USA ();
		Seattle.printMenu("Seattle");

		
		
	}

}
