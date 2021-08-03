package A.B;


import java.awt.Color;
import java.io.Serializable;

public class StairTile extends FloorTile implements Serializable {
	
	public StairTile(int x, int y){
		super(">", Color.pink, x, y);
	}
}