package A.B;

import java.io.Serializable;

public class Sword extends Weapon implements Serializable {
	
	public Sword(String name, int dmg){
		super(name, dmg);
	}
	
	public String toString(){
		return super.toString() + "Sword of " + getName();
	}
	
}