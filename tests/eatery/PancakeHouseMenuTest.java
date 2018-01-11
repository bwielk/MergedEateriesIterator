package eatery;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PancakeHouseMenuTest {

	PancakeHouseMenu pancakeHouse;
	
	@Before
	public void before(){
		pancakeHouse = new PancakeHouseMenu();
	}
	
	@Test
	public void menuHasMeals() {
		assertEquals(3, pancakeHouse.getMenu().size());
		pancakeHouse.addItem("xxx", "yyy", true, 3.00);
		assertEquals(4, pancakeHouse.getMenu().size());
	}
}
