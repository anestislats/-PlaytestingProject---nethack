package A.B;

import java.io.Serializable;

public class Gold extends Item implements Serializable  {
	
	public Gold(int amount){
		super(amount);
	}
	
	public String toString(){
		return super.toString() + "Gold";
	}
	
}