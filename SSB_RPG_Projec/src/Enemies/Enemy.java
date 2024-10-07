package Enemies;
import characters.Character;

public abstract class Enemy {
	
	protected String name;
	protected int hp;
	protected int strength;
	protected int defense;

	
	public void setName(String name) {
		this.name = name;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public void attack(Character charFighting) {
		
		
		if(charFighting.defend() == true) {
			
			int damageGivenWithShield = (int) ((this.strength - charFighting.getDefense()) * 0.5);
			
			charFighting.setHp(damageGivenWithShield);
			
			System.out.println("Damage given: " + damageGivenWithShield);
			
		}else {
			
			int damageGiven = this.strength - charFighting.getDefense();
			
			charFighting.setHp(damageGiven);
			
			System.out.println("Damage given: " + damageGiven);

			
		}
		
		
	
		
		
	}
	
	public String getName() {	
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getStrength() {
		return strength;
	}

	public int getDefense() {
		return defense;
	}
	
}
