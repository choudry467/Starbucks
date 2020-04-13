import java.util.HashMap;

public class Register {
	HashMap<String, Preference> record;
	
	public Register() {
		record = new HashMap<String, Preference>();
	}
	
	public void add(String name, String t, boolean sugar, boolean cream) {
		if (!record.containsKey(name)) {
			Preference pref = new Preference();
			pref.addPref(t);
			pref.sweet(sugar);
			pref.cream(cream);
			System.out.println("Coupon " +pref.coupon());
			record.put(name, pref);
		} else if (record.containsKey(name)) {
			Preference pref;
			pref = record.get(name);
			pref.addPref(t);
			pref.sweet(sugar);
			pref.cream(cream);
			System.out.println("Coupon " +pref.coupon());
			record.put(name, pref);
		}
	}
	
	public void add(String name, String t) {
		if (!record.containsKey(name)) {
			Preference pref = new Preference();
			pref.addPref(t);
			System.out.println("Coupon " +pref.coupon());
			record.put(name, pref);
		}else if (record.containsKey(name)) {
			Preference pref;
			pref = record.get(name);
			pref.addPref(t);
			System.out.println("Coupon " +pref.coupon());
			record.put(name, pref);
		}
		
	}
	
	public void removepref(String name, String t) {
		Preference pref;
		pref = record.get(name);
		pref.removePref(t);
	}
	
	public void changesugar(String name, boolean sugar) {
		Preference pref;
		pref = record.get(name);
		pref.sweet(sugar);
	}
	
	public void changecream(String name, boolean cream) {
		Preference pref;
		pref = record.get(name);
		pref.cream(cream);
	}
	
	public Preference getpref(String name) {
		
		return record.get(name);
	}
	
	public void display(String name) {
		Preference pref = this.getpref(name);
		System.out.println("User " +name);
		System.out.println("Drinks " +pref.pref);
		System.out.println("Sugar "+pref.sugar);
		System.out.println("Cream "+pref.cream+"\n");
	}
}
