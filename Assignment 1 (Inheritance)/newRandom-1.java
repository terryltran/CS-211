/*Assignment 1 - Inheritance
 * Terry Tran - terry.tran@bellevuecollege.edu
 *  Student ID: 950684347
 * Date: 1/8/2019 (WINTER)
 * This program copies the Random scanner by using "extends" and allows me to upgrade it.
 */
package classAssignments;
import java.util.*;
public class newRandom extends Random{
	
	public int nextInt2 (int low, int high) { //Gives random integer from range low to high
		int n = nextInt(high-low+1)+low;
		return n;
	}
	
	public double nextDouble2 () { //Gives random decimal from a range 0.0 to 1.0
		double n =nextDouble()+1.0;
		return n;
	}
	public int nextEven (int low, int high) { // Gives random even numbers from a given low and high integer
		int n=nextInt(high-low+1)+low;
		if (n%2!=0) {
			while(n%2!=0) {
				n=nextInt(high-low+1)+low;
			}
			return n;
		} else {
		return n;
		}
	}
	public int nextOdd (int low, int high) { //Gives random odd numbers from a given low and high integer
		int n = nextInt(high-low)+low;
		if (n%2!=1) {
			while (n%2!=1) {
			n = nextInt(high-low+1)+low;
		}
		return n;
		}else {
			return n;
			
		}
	}
	public char nextCharCap() { //Gives random capital letter
		int n = nextInt(26)+'A';
		return (char)n;
	}
	public char nextCharLow() { //Gives random lower letter 
		int n =nextInt(26)+'a';
		return (char)n;
	}
	public char nextChar(char low, char high) { //Gives random letters from one letter (low) to another letter (high)
		int n = 0; 
		if((int)low < (int)high) {
			n = nextInt((int)high-(int)low + 1)+low;		
			} else if ((int)low>(int)high) {
				int highRange = 'Z' - low + 1;
				int lowRange = high - 'A' + 1;
				n = nextInt(highRange + lowRange) + low;
		if (n > (int)'Z'){
			n = n - 26;
		}
			} else { //If you give the same letter, you will receive this line
				System.out.println("You gave the same letter.");
			}
		return (char) n;
}
	
	public String nextWord (int length) { //Gives random string depending on how long length is
		String random3 = new String ();
			for (int i = 0; i < length; i++) {
				char n = (char) ((char) nextInt(26)+'A');
				random3 =random3 + n;
			}
			
		return random3;
	}
	
	public String nextColor () { //Gives random letter 
		String[] colorlist = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
		return colorlist[nextInt((colorlist.length-1)+1)+0];
	}
	
	
}
