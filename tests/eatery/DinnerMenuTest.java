package eatery;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DinnerMenuTest {
	
	private DinnerMenu dinnerMenu;
	
	@Before
	public void before(){
		dinnerMenu = new DinnerMenu();
	}

	@Test
	public void dinnerMenuHasMeals() {
		assertEquals(3, dinnerMenu.getNumberOfItems());
		dinnerMenu.addItem("Cottage cheese dumplings", "Trafitional dumplings", true, 10.00);
		assertEquals(4, dinnerMenu.getNumberOfItems());
	}

}
