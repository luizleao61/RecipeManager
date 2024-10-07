package items;

public abstract class Item {
	
	private String name;
	private int quantity;
	private int typeOfItem;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getTypeOfItem() {
		return typeOfItem;
	}
	public void setTypeOfItem(int typeOfItem) {
		this.typeOfItem = typeOfItem;
	}

	
}
