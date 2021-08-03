package A.B;


import java.awt.Color;
import java.io.Serializable;

public class Boss extends Monster implements Serializable {
	
	public Boss(int x, int y){
		super(x, y, new Color(255, 0, 20));
	}
	
}