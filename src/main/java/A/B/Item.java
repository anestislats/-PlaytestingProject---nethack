package A.B;

import java.io.Serializable;

public class Item implements Serializable {
	public int amount;
	public String ID ;
	
	public Item(int amount){
		this.amount = amount;
		ID = "" + FreshIDGenerator.idGenerator.getNextId() ;
	}
	
	public int getAmount(){
		return amount;
	}
	
	public void addAmount(int num){
		amount += num;
	}
	
	public void decreaseAmount(int num){
		amount -= num;
	}
	
	public String getAttackDmgString(){
		return "";
	}
	
	public String toString(){
		return amount + "x ";
	}
}