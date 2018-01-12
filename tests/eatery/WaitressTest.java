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
	public void waitressKnowsHowManyItemsAreInTheDinnerMenu(){
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
	
	@Test
	public void waitressKnowsHowManyItemsAreInThePancakesMenu(){
		waitress.updateKnowledge();
		assertEquals(3, waitress.getNumberOfPancakeHouseItems());
		pancakes.addItem("Choc chip pancakes", "sweet breakie", true, 6.00);
		pancakes.addItem("Pancakes with cheese", "Heavy duty breakie", true, 7.00);
		waitress.updateKnowledge();
		assertEquals(5, waitress.getNumberOfPancakeHouseItems());
		pancakes.addItem("Plain pancakes", "pancakes on their own", true, 3.00);
		pancakes.addItem("Pancakes with nutella", "super sweet breakie", true, 4.00);
		waitress.updateKnowledge();
		assertEquals(7, waitress.getNumberOfPancakeHouseItems());
	}
}
