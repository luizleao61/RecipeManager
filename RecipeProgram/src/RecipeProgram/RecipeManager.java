package RecipeProgram;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class RecipeManager {
	
	private Scanner scanner;
	private HashMap<Recipe, ArrayList<String>> ingredientList;
	private ArrayList<Recipe> recipeList; 
	
	RecipeManager(Scanner scanner) {
		
		this.scanner = scanner;
		this.ingredientList = new HashMap<>();
		this.recipeList = new ArrayList<>();
		
	}
	
	public void recipeRegistration() {
		
		System.out.println("Please, input your recipe info bellow\n");
		
		System.out.print("Recipe name: ");
		String recipeName = scanner.nextLine();
		
		System.out.print("Cooking time: ");
		int cookingTime = Integer.valueOf(scanner.nextLine());
		
		Recipe newRecipe = new Recipe(recipeName, cookingTime);
		
		this.recipeList.add(newRecipe);

		
		System.out.println("");
		System.out.println("Now, add the ingredients");
		
		
		this.ingredientList.putIfAbsent(newRecipe, new ArrayList<>());
		
		ArrayList<String> ingredients = this.ingredientList.get(newRecipe);
		
		while(true) {
			
			System.out.print(">");
			
			String addIng = scanner.nextLine();
			
			if(addIng.isBlank()) {
				break;
			}
			
			ingredients.add(addIng);
			
			
		}
		

	}
	
	public void listRecipes() {
		
		
		for(Recipe currentRecipe: this.recipeList) {
			
			System.out.println(currentRecipe);
			
		}
		
	}
	
}
