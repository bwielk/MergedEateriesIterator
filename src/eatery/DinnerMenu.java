package eatery;

public class DinnerMenu {
	
	static final int MAX_ITEMS = 6;
	private MenuItem[] menu;
	private int numberOfItems = 0;
	
	public DinnerMenu(){
		menu = new MenuItem[MAX_ITEMS];
		addItem("Penne with mushrooms", "Penne with creamy mushroom sauce", true, 13.00);
		addItem("Sirloin steak", "6oz Sirloin steak with chips and coleslaw", false, 12.00);
		addItem("Penne with tomato sauce", "Penne with Italian style sauce", true, 15.00);
	}
	
	public DinnerMenuIterator createIterator(){
		return new DinnerMenuIterator(menu);
	}

	public int getNumberOfItems(){
		return numberOfItems;
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price){
		MenuItem item = new MenuItem(name, description, vegetarian, price);
		menu[numberOfItems] = item;
		numberOfItems += 1;
	}
}