package eatery;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PancakeHouseMenuIteratorTest {
	
	private PancakeHouseMenu pancakeMenu;
	private PancakeHouseMenuIterator pancakeHouseIterator;
	
	@Before
	public void before(){
		pancakeMenu = new PancakeHouseMenu();
		pancakeHouseIterator = pancakeMenu.createIterator();
	}
	
	@Test
	public void iterastorReturnsPancakeMenu() {
		MenuItem item1 = (MenuItem)pancakeHouseIterator.next();
		assertEquals(false, item1.isVegetarian());
		assertEquals(4.50, item1.getPrice(), 0.1);
		MenuItem item2 = (MenuItem)pancakeHouseIterator.next();
		assertEquals(true, item2.isVegetarian());
		assertEquals(4.00, item2.getPrice(), 0.1);
		MenuItem item3 = (MenuItem)pancakeHouseIterator.next();
		assertEquals(true, item3.isVegetarian());
		assertEquals(3.50, item3.getPrice(), 0.1);
	}
}
