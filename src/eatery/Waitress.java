package eatery;

public class Waitress {
	
	private PancakeHouseMenu pancakeHouseMenu;
	private DinnerMenu dinnerMenu;
	private int dinnerItemsNumber;
	private int pancakesItemsNumber;
	
	public Waitress(PancakeHouseMenu pancakeMenu, DinnerMenu dinnerMenu){
		this.pancakeHouseMenu = pancakeMenu;
		this.dinnerMenu = dinnerMenu;
	}
	
	public void updateKnowledge(){
		Iterator dinner = dinnerMenu.createIterator();
		Iterator pancakes = pancakeHouseMenu.createIterator();
		dinnerItemsNumber = setNumOfItems(dinner);
		pancakesItemsNumber = setNumOfItems(pancakes);
	}
	
	public int getNumberOfDinnerItems(){
		return dinnerItemsNumber;
	}
	
	public int getNumberOfPancakeHouseItems(){
		return pancakesItemsNumber;
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
