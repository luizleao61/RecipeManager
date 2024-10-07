package game;

import java.util.Scanner;

import Enemies.Enemy;
import characters.Character;


public class BattleMode {
	
	private Scanner scanner;
	
	public BattleMode(Scanner scanner) {
		
		this.scanner = new Scanner(System.in);
		
	}
	
	public void battleStart(Character charFighting, Enemy enemyFighting) {
		
		System.out.println("TIME TO BATTLE!");
		
		while(charFighting.getHp() > 0 || enemyFighting.getHp() > 0) {
			
			System.out.println("1 - Attack\n"
					+ "2 - Defend\n"
					+ "3 - Use Item\n"
					+ "4 - Run\n");
			
			String command = scanner.nextLine();
			
			switch(command) {
			
			case "1":
				
				System.out.println("You attacked!");
				
				charFighting.attack(enemyFighting);
				
				System.out.println(" ");
				System.out.println("Enemy Turn!");
				
				enemyFighting.attack(charFighting);
				
			
				break;
				
			case "2":
				
				System.out.println("You used your shield!");
				
				charFighting.defend();
				
				System.out.println(" ");
				System.out.println("Enemy Turn!");
				
				enemyFighting.attack(charFighting);
				
				break;
			
				
			}

			}
		
		if(charFighting.getHp() <= 0) {
			
			System.out.println("You lose");
			
		}else if(charFighting.getHp() > 0 || enemyFighting.getHp() < 0) {
			
			System.out.println("CONGRATULATIONS!");
			
			
		}
		
	}
	
}
