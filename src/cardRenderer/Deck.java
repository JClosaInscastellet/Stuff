package cardRenderer;

import java.util.LinkedList;

public class Deck {
	
	LinkedList<Card> deck = new LinkedList<>();
	
	private int deckMaxCNum;
	
	public Deck(int dmn) {
		this.deckMaxCNum = dmn;
	}
	
	
	public LinkedList<Card> getDeck() {
		return deck;
	}
	
	public void addCard(Card c) {
		deck.add(new Card(c.getMaxNum(),c.getNumber(),c.getMaxType(),c.getType()));
	}
	public Card returnOne(int i) {
		return deck.get(i);
	}


	public int getDeckMaxNum() {
		return deckMaxCNum;
	}
	
}
