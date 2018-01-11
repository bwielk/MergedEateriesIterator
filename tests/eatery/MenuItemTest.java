package eatery;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MenuItemTest {
	
	MenuItem meal;
	
	@Before
	public void before(){
		meal = new MenuItem("Pancakes", "Pancakes served with maple syrup", true, 4.00);
	}
	
	@Test
	public void mealHasName() {
		assertEquals("Pancakes", meal.getName());
	}
	
	@Test
	public void mealHasDescription(){
		assertEquals("Pancakes served with maple syrup", meal.getDescription());
	}
	
	@Test
	public void mealIsVegetarian(){
		assertEquals(true, meal.isVegetarian());
	}
	
	@Test
	public void mealHasPrice(){
		assertEquals(4.00, meal.getPrice(), 0.1);
	}
}