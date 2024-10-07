package items;

import java.util.Map;
import java.util.HashMap;

public class ItemBag {
	
	private Map<Integer, Item> item;
	
	public ItemBag() {
		
		this.item = new HashMap<>();
		
	}
	
	public void addItemToBag(Integer typeOfItem, Item itemToAdd) {
		
		this.item.putIfAbsent(typeOfItem, itemToAdd);
		
	}
	
}
