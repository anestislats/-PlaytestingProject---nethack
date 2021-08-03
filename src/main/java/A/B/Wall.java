package A.B;


import java.awt.Color;
import java.io.Serializable;

public class Wall extends Tile implements Serializable {
	
	public Wall(){
		super("#", Color.white);
		
	}
	
	public Wall(int x, int y){
		super("#", Color.white, x, y);
	}
	
}