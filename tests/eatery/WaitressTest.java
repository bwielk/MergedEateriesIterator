package eatery;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WaitressTest {
	
	private Waitress waitress;
	private PancakeHouseMenu pancakes;
	private DinnerMenu dinner;
	
	@Before
	public void before(){
		pancakes = new PancakeHouseMenu();
		dinner = new DinnerMenu();
		waitress = new Waitress(pancakes, dinner);
	}
	
	@Test
	public void waitressKnowsHowManyItemsAreInTheDinnerMenu() {
		waitress.updateKnowledge();
		assertEquals(3, waitress.getNumberOfDinnerItems());
		dinner.addItem("Stew", "Hungarian Stew", false, 10.00);
		waitress.updateKnowledge();
		assertEquals(4, waitress.getNumberOfDinnerItems());
		dinner.addItem("Ratatouille", "French classic", true, 13.00);
		dinner.addItem("Vegetarian Haggis", "Scottish classic", true, 10.00);
		waitress.updateKnowledge();
		assertEquals(6, waitress.getNumberOfDinnerItems());
	}
}
