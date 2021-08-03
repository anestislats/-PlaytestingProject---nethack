package A.B;

import java.io.Serializable;

public class BareHand extends Weapon implements Serializable{
	
	public BareHand(int dmg){
		super("Hands", dmg);
	}
	
	public String toString(){
		return super.toString() + "Bare Hands";
	}
	
}