
public class Main {

	public static void main(String[] args) {
		Register monday = new Register();
		
		monday.add("Ali", "Coffee", true, true); // Adds new user Ali
		
		for (int i =0; i<7; i++) {
			monday.add("Ali", "Tea"); //Every 4th drink is free for Ali
		}
		monday.add("Fazil", "Coffee", false , true); // New user Fazil
		
		for (int i =0; i<2; i++)
			monday.add("Fazil", "Tea"); // 3 drinks
		
		monday.add("Ali", "Hot Chocolate"); // Because its a drink for a different user, doesn't return coupon
		
		monday.display("Ali");
		
		monday.display("Fazil");
	}

}
