package eatery;

import java.util.Iterator;

public class Waitress {
	
	private Menu pancakeHouseMenu;
	private Menu dinnerMenu;
	private Menu cafeMenu;
	private int dinnerItemsNumber;
	private int pancakesItemsNumber;
	private int cafeItemsNumber;
	
	public Waitress(Menu pancakeMenu, Menu dinnerMenu, Menu cafeMenu){
		this.pancakeHouseMenu = pancakeMenu;
		this.dinnerMenu = dinnerMenu;
		this.cafeMenu = cafeMenu;
	}
	
	public void updateKnowledge(){
		Iterator dinner = dinnerMenu.createIterator();
		Iterator pancakes = pancakeHouseMenu.createIterator();
		Iterator cafe = cafeMenu.createIterator();
		dinnerItemsNumber = setNumOfItems(dinner);
		pancakesItemsNumber = setNumOfItems(pancakes);
		cafeItemsNumber = setNumOfItems(cafe);
	}
	
	public int getNumberOfDinnerItems(){
		return dinnerItemsNumber;
	}
	
	public int getNumberOfPancakeHouseItems(){
		return pancakesItemsNumber;
	}
	
	public int getNumberOfCafeItems() {
		return cafeItemsNumber;
	}
	
	private int setNumOfItems(Iterator iterator){
		int result = 0;
		while(iterator.hasNext()){
			iterator.next();
			result += 1;
		}
		return result;
	}
}