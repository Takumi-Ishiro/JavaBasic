package practice13.common;

public class SuperHero extends Hero {
	
	private Item equipment;

	public int attack() {
	
		int plusPower = super.attack() + this.equipment.getDamage();
		return plusPower;
	}
	
	public void setEquipment(Item equipment) {
		
		this.equipment = equipment;
		
	}

	public Item getEquipment() {
		
		return this.equipment;
		
	}

}
