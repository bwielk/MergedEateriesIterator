package eatery;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator{

	MenuItem[] items;
	int position = 0;
	
	public DinnerMenuIterator(MenuItem[] menu){
		this.items = menu;
	}
	
	public Object next(){
		MenuItem item = items[position];
		position += 1;
		return item;
	}
	
	public boolean hasNext(){
		if(position >= items.length || items[position] == null){
			return false;
		}
		return true;
	}
}
