package main;

import characters.*;
import characters.Character;
import characters.Character;
import game.AllStarRestArea;

import java.util.Scanner;

public class UserInterface {
	
	private Scanner scanner;
	
	public UserInterface(Scanner scanner) {
		
		this.scanner = new Scanner(System.in);
		
	}
	
	public void start() {
		
		System.out.println("Welcome to the Super Smash Bros RPG \n"
				+ "Here, you can choose between 5 characters and battle the evil Gygas\n"
				+ "However, you need to fight and kill monsters to gain XP for you to be\n"
				+ "able to defeat Gygas.\n"
				+ "Along the game you will be able to go into places, talk to NPCs, and everything else\n"
				+ "that you could do in a decent RPG.\n"
				+ "So please, have fun!\n");
		
		System.out.println(" ");
		System.out.println("===========================");
		System.out.println(" ");
		
		System.out.println("Welcome to the caracther selection. First of all, I need your name: ");
		String playerName = scanner.nextLine();
		
		System.out.println(" ");
		System.out.println("Ok, thanks. Now you can choose your caracther using your keyboar numbers bellow: \n");
		
		System.out.println("1 - Kirby\n"
				+ "2 - Link\n"
				+ "3 - Joker\n"
				+ "4 - Captain Falcon\n"
				+ "5 - Ness\n");
		
		String command = scanner.nextLine();
		
		switch(command) {
		
		case "1": 
			
			Character link = new Link();
			
			AllStarRestArea gameStart = new AllStarRestArea(scanner);
			
			gameStart.start(link);
		
		}
	
		
	}

}
