package A.B;

import java.io.Serializable;

public class HealthPotion extends Item implements Serializable {
	public int restoreAmt;
	
	public HealthPotion(){
		super(1);
		restoreAmt = 6;
	}
	
	public int getRestoreAmount(){
		return restoreAmt;
	}
	
	public String toString(){
		return super.toString() + "Health Potion";
	}
}