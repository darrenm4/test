package week6lab2;

public class pairOfDice {
	
	
	//variables
	private Dice dice1;
	private Dice dice2;
	
	public pairOfDice() {
		dice1=new Dice();
		dice2=new Dice();
	}
	
	public void roll() {
		dice1.roll();
		dice2.roll();
	}
	
	public String getFaceValues(){
		
		return "("+ dice1.getFaceValue()+","+ dice2.getFaceValue()+")";
	}
	
	
	
		
}//end main
