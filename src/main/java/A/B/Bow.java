package A.B;

import java.io.Serializable;

public class Bow extends Weapon implements Serializable {
	
	public Bow(String name, int dmg){
		super(name, dmg);
	}

	
	public String toString(){
		return super.toString() + "Bow of " + getName();
	}
}