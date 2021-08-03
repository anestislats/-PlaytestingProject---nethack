package A.B;

import java.io.Serializable;

public class Water extends Item implements Serializable {
	public int restoreAmt;
	
	public Water(){
		super(1);
		restoreAmt = 8;
	}
	
	public int getRestoreAmount(){
		return restoreAmt;
	}
	
	public String toString(){
		return super.toString() + "Water";
	}
}