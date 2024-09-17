package RecipeProgram;
import java.util.Scanner;

public class UserInterface {
	
	private Scanner scanner;
	
	public UserInterface(Scanner scanner) {
		
		this.scanner = scanner;
		
	}
	
	public void start() {
		
		while(true) {
			
			RecipeManager manager = new RecipeManager(scanner);
			
			System.out.println("Welcome Recipe Manager\n"
					+ "What do you wish to do?\n");
			
			System.out.println("add - add recipe\r\n"
					+ "list - lists the recipes\r\n"
					+ "stop - stops the program\r\n"
					+ "find name - searches recipes by name\r\n"
					+ "find cooking time - searches recipes by cooking time\r\n"
					+ "find ingredient - searches recipes by ingredient");
			
			System.out.print(">");
			String command = scanner.nextLine();
			System.out.println(" ");
			switch(command) {
			
			case "add": 
				
				manager.recipeRegistration();
				
				break;
				
			case "list": 
				
				manager.listRecipes();
				
				
			}
			
		}
		
	}
			
}
		
