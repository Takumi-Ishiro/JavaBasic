package practice13.common;

public class Item {

	private String name;
	private int additionalDamage;
	
	public Item(String name, int additionalDamage) {
		
		this.name = name;
		this.additionalDamage = additionalDamage;
		
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public void setDamage(int damage) {
		
		this.additionalDamage = damage;
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
	public int getDamage() {
		
		return this.additionalDamage;
		
	}
}
