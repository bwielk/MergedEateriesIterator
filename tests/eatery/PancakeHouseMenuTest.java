package eatery;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PancakeHouseMenuTest {

	PancakeHouseMenu pancakeMenu;
	
	@Before
	public void before(){
		pancakeMenu = new PancakeHouseMenu();
	}
	
	@Test
	public void menuHasMeals() {
		assertEquals(3, pancakeMenu.getMenu().size());
		pancakeMenu.addItem("xxx", "yyy", true, 3.00);
		assertEquals(4, pancakeMenu.getMenu().size());
	}
}
