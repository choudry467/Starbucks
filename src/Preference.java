import java.util.HashSet;
import java.util.Set;

public class Preference {
	Set<String> pref = new HashSet<String>();
	boolean sugar;
	boolean cream;
	private int count = 0;
	
	public void addPref(String t){
		this.pref.add(t);
	}
	
	public void removePref(String t){
		this.pref.remove(t);
	}
	
	public void sweet(boolean sugar) {
		this.sugar = sugar;
	}
	
	public void cream(boolean cream) {
		this.cream = cream;
	}
	
	public boolean coupon() {
		boolean coupon = false;
		count ++;
		if (count > 2) {
			count -=3;
			coupon = true;
		}
		return coupon;
	}
	

}

