/*Assignment 6 - Stack Operations 3
 * Terry Tran - terry.tran@bellevuecollege.edu
 * Student ID: 950684347
 * Date: 3/3/2019 (WINTER)
 * This program takes 5 valid mathematical statements in post-fix notation and evaluates the expressions to give an answer.
*/
package classAssignments;
import java.util.HashMap;
public class Assg06_StackOperations3 {
	static String [] statement = {"12+", "32+1-", "52*1/", "34+1-2/", "91*9-" };
	
		public static void main(String[] args) {
			for(int i=0; i<statement.length;i++) {
				String expressions = statement[i];
				System.out.println("Expression " + (i+1));
				
				System.out.println("Statement: " +statement[i]);


			Stack211<Integer> intStack = new Stack211<Integer>();

			for (int k=0;k<expressions.length(); k++) {
				char c = expressions.charAt(k);
				
				if(c>='0' && c<='9') {
					int charInt = Character.getNumericValue(c);
					intStack.push(charInt);
				}
					if (c=='+') {
						int value1=intStack.pop();
						int value2=intStack.pop();
						int finalvalue;
						finalvalue= value2+value1;
						intStack.push(finalvalue);
					} else if (c=='-') {
						int value1=intStack.pop();
						int value2=intStack.pop();
						int finalvalue;
						finalvalue=value2-value1;
						intStack.push(finalvalue);
					} else if (c=='*') {
						int value1=intStack.pop();
						int value2=intStack.pop();
						int finalvalue;
						finalvalue=value2*value1;
						intStack.push(finalvalue);
					} else if (c=='/') {
						int value1=intStack.pop();
						int value2=intStack.pop();
						int finalvalue;
						finalvalue=value2/value1;
						intStack.push(finalvalue);
					}
				}
				System.out.println("Evaluation: "+intStack.pop());
				System.out.println();
			
			
			}
			
			}
		}
		

		
		
	