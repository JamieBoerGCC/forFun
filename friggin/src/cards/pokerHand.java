package cards;

import java.util.ArrayList;

public class pokerHand {
	private ArrayList<Card> cards;
	private ArrayList<Card> bestHand;
	private ArrayList<Integer> handValue;
	private int cardsLeft;

	public pokerHand(ArrayList<Card> cs) {
		cardsLeft = 5;
		for(int i = 0; i < 13; i++) {
			if(i < 7) {
				cards.add(cs.get(i));
			}
			handValue.add(0);
		}
		this.cardsSort();

	}
	public void setBestHand() {
	}

	public ArrayList<Integer> getBestHand(){
		ArrayList<Integer> cardVals = new ArrayList();

		return cardVals;

	}

	private int straightFlush() {
		int numInRow = 0;
		int sfVal = cards.get(0).getTier();
		for(int i = 0; i < cards.size() - 1; i++) {
			if(cards.get(i).getTier() - cards.get(i+1).getTier() == 1 && cards.get(i).getSuite() == cards.get(i+1).getSuite()) {
				numInRow++;
			}
			else {
				numInRow = 0;
				sfVal = cards.get(i+1).getTier();
			}
			if(numInRow == 4) {
				for(int x = i - 4; x <= 1; x++) {
					bestHand.add(cards.remove(x));
				}
				cardsLeft = 0;
				return sfVal;
			}
		}
		return 0;
	}
	private int fourOf() {
		int numSame = 1;
		Card curMatch;
		ArrayList<Card> temp = new ArrayList<>();
		for(int i = 0; i < cards.size(); i++) {
			curMatch = cards.get(i);
			temp.add(cards.get(i));
			if(cards.get(i).getTier() == cards.get(i).getTier()) {
				numSame++;
			}
			else {
				temp = new ArrayList<>();
				numSame = 1;
			}
			if(numSame == 4) {
				for(int x = i - 3; x <= i; x++) {
					cards.remove(x);
				}
				cardsLeft = 1;
				return curMatch.getTier();
			}
		}
		return 0;
	}
	private ArrayList<Integer> fullHouse() {
		
	}
	
	private int Flush() {
		
	}
	
	private int Straight() {
		
	}

	private void cardsSort() {
		for(int i = 0; i < cards.size(); i++) {
			for(int x = 0; i + x < cards.size(); x++) {
				if (cards.get(i).compareTo(cards.get(x)) == -1) {
					Card temp = cards.get(i);
					cards.set(i, cards.get(x));
					cards.set(x, temp);
				}
			}

		}
	}


}
