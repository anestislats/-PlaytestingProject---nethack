package A.B;


import java.awt.Color;
import java.io.Serializable;

public class Mob extends Tile implements Serializable {

    public String ID ;
    
	public Mob(int x, int y, String image, Color color){
		super(image, color, x, y);
		ID = ""  + FreshIDGenerator.idGenerator.getNextId() ;
	}
	
}