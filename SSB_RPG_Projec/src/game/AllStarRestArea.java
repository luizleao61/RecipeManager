package game;

import java.util.Scanner;
import characters.Character;
import Enemies.Enemy;
import Enemies.Primid;

public class AllStarRestArea {
	
	private Scanner scanner;
	
	public AllStarRestArea(Scanner scanner) {
		
		this.scanner = new Scanner(System.in);
		
	}
	
	
	public void start(Character selectedChar) {
		
		System.out.println(selectedChar.getName() + " wake up in a strange place. You can hear a beatiful piano composed melody playing around you.\n"
				+ "Looking around you can see a green field with some trees in line besides a straight concrete made path that you\n"
				+ "are standing on. You can hear the chirps of birds flying by and the essence of new grown grass emanating from the ground.\n"
				+ "You try to remeber how you get there, but you cant. Everything in your head is blank.\n"
				+ "Even thougn you cant remember, you have the feeling that you are here to do something. Something that will change the destiny\n"
				+ "of this world.\n");
		
		String name = selectedChar.getName();
		
		switch(name) {
		
		case "Link": 
			
			System.out.println("You feel something emanating from your forehand. Its your Trifoce mark. Then sundelly you can hear a soft and calm"
					+ "woman voice at you ear saying something... 'Link... Please... Cure the darkness from this world and come back to Hyrule safe...' \n"
					+ "Its Princess Zelda voice. But where is she at? Is she safe? Those are the questions that goes trough you head.\n");
		
		}
		
		Enemy primid = new Primid();
		
		System.out.println("As you trying to regain your thoughts, some type of enemy shows up. A body and face shadowy figure with a green hat and suit covering its\n"
				+ "body. Both his hands and feet where covered with yellow gloves and boots. It was emanating evil trought shadow.\n"
				+ "");
		
		System.out.println("As " + selectedChar.getName() + " where trying to come closer to the creature, it jumps onto him. " + selectedChar.getName() + "dodges from the\n"
				+ "in a dime. There is no choice now but to fight back\n");
		
		BattleMode battle = new BattleMode(scanner);
		
		battle.battleStart(selectedChar, primid);
		
	}
	
}
