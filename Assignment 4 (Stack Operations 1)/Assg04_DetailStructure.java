/* Assignment 4 - Stack Operations 1
 * Terry Tran - terry.tran@bellevuecollege.edu
 * Student ID: 950684347
 * Date: 2/26/2019 (WINTER)
 * This program is checks if the following 5 statements are correct and have no errors. If there are errors in the statement, the program tells you what the error is.
 */
package classAssignments;
import java.util.*;

public class Assg04_DetailStructure {
	static HashMap <Integer, String> errorMessage = new HashMap <Integer, String>();
	static HashMap <Character, Character> pair = new HashMap <Character, Character> ();
	static String [] statements = { "(1+3} - 0", "(2+4}*3", "(1+2)-1" , "(3-1", "{3-2)-0"};
	
	public static void main(String[] args) {
		loadErrorMessages();
		loadPair();
		
		for (int i =0; i<statements.length;i++) {
			String expression = statements [i];
			Stack211<Character> st = new Stack211();
		/*	for (int j =0; j< expression.length() && correct; j++) {
				char c = expression.charAt(j);
				if(c == '{' || c == '(') { 
					st.push(c);
				}
				if(c == '}' || c == ')') {
					Boolean correct =testBrackets(c,j,st);
				}
			}
			*/
			
		}

	}


	public static void loadPair() {
		pair.put('(', ')');
		pair.put('{', '}');
		
	}

	public static void loadErrorMessages() {
		errorMessage.put(1, "Syntax Error: Incomplete Expression: Unpaired {");
		errorMessage.put(2, "Syntax Error: Incomplete Expression: Unpaired (");;
		errorMessage.put(3, "Syntax Error: Incomplete Expression");
		
	}
	
	public static void printError (int location, int errorNo) {
		for (int i =0; i<location; i++) {
			System.out.print(" ");
		
		System.out.println("^");
		System.out.println(errorMessage.get(errorNo));
		
		for (int j = 0; j<statements[i].length(); j++) {
			char c = statements[i].charAt(j);
				if ((c=='(' || (c=='{'))) {
					Stack211.push(c);
				}
				if (c=='}' || c==')') {
					if(Stack211.isEmpty()) {
						printError(j, 3);	
					} else if (!Stack211.isEmpty()) {
						char PopedChar = Stack211.pop();
						if(!(PopedChar == pair.get(c))) {
							if (PopedChar=='(') {
								errorNo=1;
							} else {
								errorNo=2;
							}
							printError(j, errorNo);
						}
					}
			}
		}
		}
	}
}
