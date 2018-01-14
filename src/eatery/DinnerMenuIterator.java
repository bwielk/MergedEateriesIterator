package eatery;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator{

	private MenuItem[] items;
	private int position = 0;
	
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
	
	public void remove(){
		if(position <= 0){
			throw new IllegalStateException("You can’t remove an item until you’ve done at least one next()");
		}
		if(items[position-1] != null){
			for(int i = position; i<(items.length-1); i++){
				items[i] = items[i+1];			}
		}
		items[items.length-1] = null;
	}
}