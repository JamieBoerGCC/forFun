package cards;

public class Card {
	private String N;
	private Character S;
	private int V;
	private int T;
	private boolean isInDeck;
	public Card(String name, char suite, int blval, int tier) {
		N = name;
		S = suite;
		V = blval;
		T = tier;
		isInDeck = true;
	}
	public String getCard() {
		return N;
	}
	public char getSuite() {
		return S;
	}
	public int blNum() {
		return V;
	}
	public int getTier() {
		return T;
	}
	public boolean isInDeck() {
		return isInDeck;
	}
	public void removeCard() {
		isInDeck = false;
	}
	
	public int compareTo(Card c) {
		if(this.getTier() > c.getTier()) {
			return 1;
		}
		else if(this.getTier() < c.getTier()) {
			return -1;
		}
		else {
			return 0;
		}
	}

}
