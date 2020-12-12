/* Assignment 5 - Stack Operations 2
 * Terry Tran - terry.tran@bellevuecollege.edu
 * Student ID: 950684347
 * Date: 3/1/2019 (WINTER)
 * This program takes 5 valid mathematical operations in in-fix notation and converts it to post-fix notation.
 */
package classAssignments;
import java.util.*;
public class Assg05_StackOperations2 {
	static String [] statement = {"(1+2)-3", "3+2-1", "5*2/(1)", "(3+4-1)/2", "(9*1)-9" };
	public static String post = "";
	public static void main(String[] args) {
		for(int i=0; i<statement.length;i++) {
			System.out.println("Expression " + (i+1));
			
			System.out.println("Infix: " +statement[i]);

			
			Stack211 <Character> st = new Stack211 <Character>();
			post = "";
			for (int j=0; j<statement[i].length(); j++) {
				char c = statement[i].charAt(j);
				
				if (c>='0' && c<='9') {
					post +=c;
				} else if (c == '(' || c =='{')	{
					st.push(c);
					} else if (c == ')' || c == '}') {
						char p = st.pop();
						
						while(p!= '(' && p!='{') {
							post +=p;
							p =st.pop();
							}
						} else if (c=='+' || c=='-' || c=='*' || c=='/' ) {
							while(!st.isEmpty() && precedence(st.topOfStack(),c)) {
								char p = st.pop();
								post +=p;
							}
							st.push(c);
						}
				}
		while (!st.isEmpty()) {
			char p = st.pop();
			post +=p;
			}
		System.out.println("Postfix: " +post);
		System.out.println();
		}
		

	}


	public static boolean precedence (char topOfStack, char c) {
		HashMap<Character, Integer> precedence = new HashMap <>();
		precedence.put('+', 1);
		precedence.put('-', 1);
		precedence.put('*', 2);
		precedence.put('/', 2);
		precedence.put('(', 3);
		precedence.put(')', 3);
		
		if (precedence.get(c) >= precedence.get(topOfStack)){
			return true;
		} else {
			return false;
		}
	}
}