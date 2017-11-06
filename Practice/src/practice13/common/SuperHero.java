package practice13.common;

public class SuperHero extends Hero {
	
	private String name;
	private int damage;
	
	Item equipment = new Item(name, damage);
	
	public int attack() {
	
		int plusPower = super.attack() + equipment.getDamage();
		return plusPower;
	}
	
	public void setItemName(String name) {
		
		this.name = name;
		
	}
	public void setItemDamage(int damage) {
		
		this.damage = damage;
		
	}
	
	public String getItemName() {
		
		return this.name;
		
	}
	
	public int getItemDamage() {
		
		return this.damage;
		
	}
}
