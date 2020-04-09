import java.util.HashMap;

public class Register {
	HashMap<String, Preference> record;
	
	public Register() {
		record = new HashMap<String, Preference>();
	}
	
	public void add(String name, String t, boolean sugar, boolean cream) {
		Preference pref = new Preference();
		pref.addPref(t,sugar,cream);
		System.out.println("Coupon " +pref.coupon());
		record.put(name, pref);
	}
	
	public void add(String name, String t) {
		Preference pref;
		pref = record.get(name);
		pref.addPref(t);
		System.out.println("Coupon " +pref.coupon());
		record.put(name, pref);
	}
	
	public Preference getpref(String name) {
		
		return record.get(name);
	}
	
	public void display(String name) {
		Preference pref = this.record.get(name);
		System.out.println("User " +name);
		System.out.println("Drinks " +pref.pref);
		System.out.println("Sugar "+pref.sugar);
		System.out.println("Cream "+pref.cream);
	}
}
