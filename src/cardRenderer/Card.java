package cardRenderer;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;



public class Card {
	private int number;
	private int type;
	private int maxNum;
	private int maxType;
	private boolean hasColor;
	private String color;
	public Image CARD;
	
	public Card(int mNum,int num,int mType,int type, boolean colored,String color) {
		this.maxNum = mNum;
		this.number = num;
		this.maxType = mType;
		this.type = type;
		this.hasColor = colored;
		this.color = color;
		if(number > maxNum) {
			number = maxNum;
		}
		if(type > maxType) {
			type = maxType;
		}

		try {
			CARD = ImageIO.read(new File("src/cardRenderer/img/blankCard.png"));
			CARD = CARD.getScaledInstance(CARD.getWidth(null)+CARD.getWidth(null)/2,
					CARD.getHeight(null)+ CARD.getHeight(null)/2,
					Image.SCALE_SMOOTH);
		}catch(IOException e){

		}


	}
	public Card(int mNum,int num,int mType,int type) {
		this.maxNum = mNum;
		this.number = num;
		this.maxType = mType;
		this.type = type;
		this.hasColor = false;
		this.color = "";

		if(number > maxNum) {
			number = maxNum;
		}
		if(type > maxType) {
			type = maxType;
		}
		
		try {
			CARD = ImageIO.read(new File("src/cardRenderer/img/blankCard.png"));
			CARD = CARD.getScaledInstance(CARD.getWidth(null)+CARD.getWidth(null)/2,
					CARD.getHeight(null)+ CARD.getHeight(null)/2,
					Image.SCALE_SMOOTH);
		}catch(IOException e){

		}
	}


	public int getNumber() {
		return number;
	}
	public int getType() {
		return type;
	}
	public int getMaxNum() {
		return maxNum;
	}
	public int getMaxType() {
		return maxType;
	}
	public boolean isHasColor() {
		return hasColor;
	}
	public String getColor() {
		return color;
	}


}
