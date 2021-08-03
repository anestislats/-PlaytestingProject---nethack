package A.B;

import java.io.Serializable;

public class Food extends Item  implements Serializable {
	public int restoreAmt;
	
	public Food(){
		super(1);
		restoreAmt = 3;
	}
	
	public int getRestoreAmount(){
		return restoreAmt;
	}
	
	public String toString(){
		return super.toString() + "Food";
	}
}