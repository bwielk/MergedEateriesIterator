package eatery;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DinerMenuTest {
	
	private DinerMenu diner;
	
	@Before
	public void before(){
		diner = new DinerMenu();
	}

	@Test
	public void dinerMenuHasMeals() {
		assertEquals(3, diner.getNumberOfItems());
		diner.addItem("Cottage cheese dumplings", "Trafitional dumplings", true, 10.00);
		assertEquals(4, diner.getNumberOfItems());
	}

}
