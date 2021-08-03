package A.B;


import java.awt.Color;
import java.io.Serializable;

public class Player extends Mob implements Serializable {
	
	public Player(int x, int y){
		super(x, y, "@", Color.magenta);

	}
	
	public void moveDown(){y++;}
	public void moveUp(){y--;}
	public void moveRight(){x++;}
	public void moveLeft(){x--;}
}