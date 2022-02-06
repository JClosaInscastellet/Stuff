package cardRenderer;

import java.awt.*;
import javax.swing.*;

public class GUI extends JFrame {
	Panel panel = new Panel();
	
	public GUI(){
		this.setVisible(true);
		this.setSize(400, 300);
		this.add(panel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
}

class Panel extends JPanel {
	
	Deck userDeck = new Deck(12);
	Card test1 = new Card(userDeck.getDeckMaxNum(),6,3,1);
	Card test2 = new Card(userDeck.getDeckMaxNum(),4,3,2);
	Card test3 = new Card(userDeck.getDeckMaxNum(),9,3,3);
	int x;
	int y;
	
	public Panel() {
		userDeck.addCard(test1);
		userDeck.addCard(test2);
		x = 20;
		y = 20;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;
		
		for(Card c : userDeck.getDeck()) {
			drawCard(g2D,c,x,y);
			x += 50;
		}
		x = 20;
		
		
	}
	
	public void drawTest(Graphics2D g2,int x,int y) {
		g2.drawImage(test1.CARD, x, y,null);	
		
		g2.drawString(Integer.toString(test1.getType()), x+19, y+42);
		g2.drawString(Integer.toString(test1.getNumber()), x+4, y+14);
		g2.drawString(Integer.toString(test1.getNumber()), x+34, y+70);
	}
	public void drawCard(Graphics2D g2,Card c,int x,int y) {
		g2.drawImage(c.CARD, x, y,null);	
		
		g2.drawString(Integer.toString(c.getType()), x+19, y+42);
		g2.drawString(Integer.toString(c.getNumber()), x+4, y+14);
		g2.drawString(Integer.toString(c.getNumber()), x+34, y+70);
	}
	
	
}