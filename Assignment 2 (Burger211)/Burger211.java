package classAssignments;

public abstract class Burger211 {
	static double b1Price, b2Price, b3Price;
	static String b1Name, b2Name, b3Name;
	static String b1Topping, b2Topping, b3Topping;
	static int b1Cal, b2Cal, b3Cal;
	static String promo;
	static double proRate;
	
	Burger211 (){
		burgerName();
		topping ();
		cal ();
		price ();
		promotion (promo, proRate);
	}


public void printMenu (String franchise) {
}	public static void burgerName () {
		b1Name = "Big Boy Burger";
		b2Name = "The Grown Man Burger";
		b3Name = "The Old Man Burger";
	}
	
	public static void topping () {
		b1Topping = "Beef patty, Tomato, Lettuce, Cheese, Ketchup";
		b2Topping = "2 Beef patties, Tomato, Lettuce, Fried Onions, Cheese, Ketchup";
		b3Topping = "2 Beef patties, Tomato, Lettuce, Grilled Onions, Cheese, Ketchup";
	}
	
	public static void cal () {
		b1Cal = 400;
		b2Cal = 700;
		b3Cal = 650;
	}
	
	public static void price () {
		b1Price = 6.5;
		b2Price = 8.0;
		b3Price = 7.0;
	}
	
	public static void promotion (String promo1, double proRate1) {
		// I was unable to find a way to make my promotion 0.0
		proRate = 0.4;
	}
} class VIETNAM extends Burger211{
	static double exRate = 2000.2;
	
	VIETNAM (){
		b1Price = b1Price *exRate * proRate; 
		b2Price = b2Price *exRate * proRate;
		b3Price = b3Price *exRate * proRate;
	}
 public void printMenu (String franchise) {
		String b1Info = b1Name + ": " + b1Cal + "Cal " + " VSD " +b1Price + " (Was 13001.3)";
		String b2Info = b2Name + ": " + b2Cal + "Cal " + " VSD " +b2Price + " (Was 16001.6)";
		String b3Info = b3Name + ": " + b3Cal + "Cal " + " VSD " +b3Price + " (Was 14001.4)";
		promo = "    Lunar New Year Promotion! 40% OFF!";
		new MenuGUI(franchise, b1Info, b1Topping, b2Info, b2Topping, b3Info, b3Topping, promo);
	}
	
} class USA extends Burger211 {
	public void printMenu (String franchise) {
		String b1Info = b1Name + ": " + b1Cal + "Cal " + " USD " +b1Price;
		String b2Info = b2Name + ": " + b2Cal + "Cal " + " USD " +b2Price;
		String b3Info = b3Name + ": " + b3Cal + "Cal " + " USD " +b3Price;
		promo = "        Be Quiet and eat. It's better that way.";
		new MenuGUI(franchise, b1Info, b1Topping, b2Info, b2Topping, b3Info, b3Topping, promo);
	}
}


