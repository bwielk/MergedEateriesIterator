package eatery;

import static org.junit.Assert.*;

import java.util.Iterator;
import org.junit.Before;
import org.junit.Test;

public class DinnerMenuIteratorTest{
	
	private Iterator dinnerMenuIterator;
	private Menu dinnerMenu;

	@Before
	public void before(){
		dinnerMenu = new DinnerMenu();
		dinnerMenuIterator = dinnerMenu.createIterator();
	}
	
	@Test
	public void iteratorReturnsDinnerMenu(){
		MenuItem item1 = (MenuItem)dinnerMenuIterator.next();
		assertEquals(true, item1.isVegetarian());
		assertEquals(13.00, item1.getPrice(), 0.1);
		MenuItem item2 = (MenuItem)dinnerMenuIterator.next();
		assertEquals(false, item2.isVegetarian());
		assertEquals(12.00, item2.getPrice(), 0.1);
		MenuItem item3 = (MenuItem)dinnerMenuIterator.next();
		assertEquals(true, item3.isVegetarian());
		assertEquals(15.00, item3.getPrice(), 0.1);
	}

}
