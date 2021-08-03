package A.B;


import java.awt.Color;
import java.io.Serializable;

public class BlankTile extends Tile implements Serializable {

	public BlankTile(){
		super(" ", Color.black);
	}

}