import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Starbuckstest {
	Register day;
	Preference pref1;

	@Before
	public void setUp() throws Exception {
		day = new Register();
		day.add("John", "Coffee", true, true); // Adds new user John with sugar and cream preferences true
		
		pref1 = new Preference();
		pref1.addPref("Chai Tea");
	}

	@Test
	public void testPrefCoupon() {
		assertEquals(false,pref1.coupon());
		assertEquals(false,pref1.coupon());
		assertEquals(true,pref1.coupon()); //every 3th entry returns true. Free coupon on 3 coffees
		
	}
	
	@Test
	public void testsugarNcream() {
		Preference pref;
		pref= day.getpref("John");
		assertEquals(true,pref.sugar);
		day.changesugar("John", false);
		assertEquals(false,pref.sugar);//sugar preference change check
		assertEquals(true,pref.cream);
		day.changecream("John", false);
		assertEquals(false,pref.cream);//sugar preference change check
	}
	
	@Test
	public void testregister() {
		day.add("Ross", "Hot Chocolate");
		assertEquals(true,day.record.containsKey("Ross"));
		assertEquals(false,day.record.get("Ross").pref.contains("Coffee"));
		day.add("Ross", "Coffee");
		assertEquals(true,day.record.get("Ross").pref.contains("Coffee"));
		day.removepref("Ross", "Coffee");
		assertEquals(false,day.record.get("Ross").pref.contains("Coffee"));
	}

}
