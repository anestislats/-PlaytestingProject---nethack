package A.B;


import java.awt.Color;
import java.io.Serializable;

public class TestTile extends Tile implements Serializable {
	
	public TestTile(){
		super("T", Color.green);
	}
	
	public TestTile(int x, int y){
		super("T", Color.green, x, y);
	}
	
	public TestTile(int x, int y, boolean state){
		super("T", Color.red, x ,y)
;	}
}