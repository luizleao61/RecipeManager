package RecipeProgram;

public class Recipe {
	
	private String name;
	private int cookingTime;
	
	public Recipe(String name, int cookingTime) {
		
		this.name = name;
		this.cookingTime = cookingTime;
		
	}

	public String getName() {
		return name;
	}

	public int getCookingTime() {
		return cookingTime;
	}
	
	public String toString() {
		
		return this.name + ", cooking time: " + this.cookingTime;
		
	}

	
}
