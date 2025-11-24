package entities;

public class Champion {
	
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public int getLife() {
		return life;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}
	
	public void takeDamage(int attackReceived) {
	    int damage = attackReceived - this.armor;

	    if (damage < 1) {
	        damage = 1;
	    }

	    life -= damage;

	    if (life < 0) {
	        life = 0;
	    }
	}
	
	public void status() {
		if (life > 0) {
			System.out.println(name + ": " + life + " de vida");
		} else {
			System.out.println(name + ": " + life + " de vida (morreu)");
		}
	}
	

}
