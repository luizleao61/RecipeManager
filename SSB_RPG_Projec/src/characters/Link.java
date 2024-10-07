package characters;
import Weapons.Weapon;
import Weapons.TreeBough;

import java.util.ArrayList;

import items.ItemBag;

public class Link extends Character {
	
	private ItemBag linkBag;
	
	public Link() {
		
		super.name = "Link";
		super.hp = 10;
		this.strength = 20;
		this.defense = 20;
		this.WeaponInUse = new TreeBough();
		
	}

	@Override
	public void psiAttack() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
