package characters;
import java.util.ArrayList;
import java.util.Map;

import Enemies.Enemy;
import Weapons.Weapon;
import items.CureItem;
import items.Item;
import items.ItemBag;

public abstract class Character {
	
	protected String name;
	protected int hp;
	protected int strength;
	protected int defense;
	protected int luck;
	protected ItemBag charBag;
	protected Weapon WeaponInUse;

	
//Character Actions:

	public void attack(Enemy enemy) {
		
		int damageGivenToEnemy = this.WeaponInUse.getPower() - enemy.getHp();
		
		if(damageGivenToEnemy >= 0) {
			
			enemy.setHp(damageGivenToEnemy);
			
			System.out.println("Damage given to enemy: " + damageGivenToEnemy);
			
		}
			
		
	}
	
	public boolean defend() {
		return true;
		
	}
	
	public void useCureItem(CureItem item) {
		
		if(item.getTypeOfItem() == 1) {
			
			this.setHp(item.getLevelOfCure());
			
		}
		
	}
	
	public void equipWeapon() {
		
	}
	
	public abstract void psiAttack();
	
	
//Character Getters:
	
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

	public int getLuck() {
		return luck;
	}
	
// Character Setters:

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

	public void setLuck(int luck) {
		this.luck = luck;
	}
	

// toString:
	
	public String toString() {
		
		return this.name;
		
	}


}
