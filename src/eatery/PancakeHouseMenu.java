package eatery;

import java.util.ArrayList;

import java.util.Iterator;

public class PancakeHouseMenu implements Menu{
	
	private ArrayList<MenuItem> menu;
	
	public PancakeHouseMenu(){
		menu = new ArrayList<MenuItem>();
		addItem("Regular Pancake Breakfast", "Pancakes with fried eggs and sausages", false, 4.50);
		addItem("Vegetarian Pancake Breakfast", "Pancakes with poached eggs and tomato", true, 4.00);
		addItem("Regular Waffle Breakfast", "Waffles with blueberries and strawberries", true, 3.50);
	}
	
	public Iterator createIterator(){
		return menu.iterator();
	}
	
	/*Method returning a PancakeHouseMenuIterator instance
	 * 
	public PancakeHouseMenuIterator createIterator(){
		return new PancakeHouseMenuIterator(menu);
	}
	*/
	
	public void addItem(String name, String description, boolean vegetarian, double price){
		MenuItem item = new MenuItem(name, description, vegetarian, price);
		menu.add(item);
	}

	public ArrayList<MenuItem> getMenu() {
		return menu;
	}
}