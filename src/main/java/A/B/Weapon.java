package A.B;

import java.io.Serializable;

public class Weapon extends Item implements Serializable {
	
	public String name;
	public int attackDmg;
	
	public Weapon(String name, int dmg){
		super(1);
		this.name = name;
		attackDmg = dmg;
	}
	
	public String getName(){
		return name;
	}
	
	
	public int getAttack(){
		return attackDmg;
	}
	
	public String getAttackDmgString(){
		return ", Attack: " + attackDmg;
	}
	

	public String toString(){
		return super.toString(); //is this even needed?
	}
	
}