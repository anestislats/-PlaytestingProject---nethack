package A.B;


import java.awt.Color;
import java.io.Serializable;

public class FloorTile extends Tile implements Serializable {
	
	public FloorTile(){
		super(" ", Color.orange); // monster's path
	}
	
	public FloorTile(int x, int y){
		super(" ", Color.orange, x, y); // every tile in map / clears when monsters step on it
	}
	
	public FloorTile(String image, Color color, int x, int y){
		super(image, color, x, y);
	}
}