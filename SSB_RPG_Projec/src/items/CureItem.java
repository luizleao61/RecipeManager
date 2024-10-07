package items;

public class CureItem extends Item{
	
	private int levelOfCure;

	public int getLevelOfCure() {
		return levelOfCure;
	}

	public void setLevelOfCure(int levelOfCure) {
		this.levelOfCure = levelOfCure;
	}
	
	public String toString() {
		
		return "Name: " + this.getName() + "\n Cure Level:" + this.getQuantity() + "\n Quantity: " + this.getQuantity();
		
	}

}
