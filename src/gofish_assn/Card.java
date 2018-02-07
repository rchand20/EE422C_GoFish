package gofish_assn;

public class Card {
	
	public enum Suits {club, diamond, heart, spade};
	
	final static int TOP_RANK = 13; //King
	final static int LOW_RANK = 1; //Ace
	
	int rank;  //1 is an Ace
	//edit to try to 
	Suits suit;
	
	public Card() {
		rank = 1;
		suit = Suits.spade;
	}
	
	public Card(int r, char s) {	
		//rank = r
		//call toSuit 

	}
	
	public Card(int r, Suits s) {
		//rank =r 
		//suit = s

	}
	
	private Suits toSuit(char c) {
		return Suits.spade; //dummy
		
		//if statements 
	}
	
	private String suitToString(Suits s)
	{
		return "s"; //dummy
		//print first character based on suit
	}
	
	private String rankToString(int r)
	{
		return "A"; //dummy
		//if statements
	}
		
	
	public int getRank() {
		return rank;
	}
	
	public Suits getSuit() {
		return suit;
	}
	
	public String toString() {
		String s = "";
		
		s = s + rankToString(getRank()) + suitToString(getSuit());
		
		return s;
	}
}
