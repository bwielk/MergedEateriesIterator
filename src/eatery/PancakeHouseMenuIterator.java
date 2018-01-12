package eatery;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator{

	private ArrayList<MenuItem> menu;
	private int position;
	
	public PancakeHouseMenuIterator(ArrayList<MenuItem> menu){
		this.menu = menu;
	}
	
	public boolean hasNext() {
		if(position >= menu.size() || menu.get(menu.size()) == null){
			return false;
		}
		return true;
	}

	public Object next() {
		MenuItem item = menu.get(position);
		position +=1;
		return item;
	}
}
