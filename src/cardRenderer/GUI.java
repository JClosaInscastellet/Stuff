package cardRenderer;

import java.awt.*;
import java.awt.event.*;

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

class Panel extends JPanel implements ActionListener{
	
	Deck userDeck = new Deck(12);
	Deck masterDeck = new Deck(12);
	boolean drawNext = false;
	JButton drawNextCard = new JButton("Next Card");
	int x=20;
	int y=50;
	
	public Panel() {
		add(drawNextCard);
		drawNextCard.addActionListener(this);
		fillMasterDeck();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;
		
		if(drawNext) {
			x=20;
			userDeck.addCard(masterDeck.returnNext());
			drawNext=false;
			for(Card c : userDeck.getDeck()) {
				drawCard(g2D,c,x,y);
				x+=50;
				
			}
			
		}
		
		
	}
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == drawNextCard) {
			drawNext=true;
			repaint();
		}
		
	}
	
	public void fillMasterDeck() {
		int num = 1,type=0;
		for(int i = 0;i<48;i++) {
			masterDeck.addCard(new Card(userDeck.getDeckMaxNum(),num,4,type));
			num++;
			if(num == 13) {
				num = 1;
				type++;
			}
		}
	}
	
	public void drawCard(Graphics2D g2,Card c,int x,int y) {
		g2.drawImage(c.CARD, x, y,null);
		g2.drawString(Integer.toString(c.getType()), x+19, y+42);
		g2.drawString(Integer.toString(c.getNumber()), x+4, y+14);
		g2.drawString(Integer.toString(c.getNumber()), x+34, y+70);
	}
	
	
}