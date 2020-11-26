package week6lab2;

public class diceTest {

	public static void main(String[] args) {
		
		pairOfDice myDie = new pairOfDice();
		
		for(int i=0;i<10;i++) {
			myDie.roll();
			System.out.println(myDie.getFaceValues());
		}
		
	}

}
