package exercise;

public class Card {
	private static int serialNum = 0;
	private int cardNum;
	
	public Card() {
		this.cardNum = serialNum;
		serialNum++;
	}
}
