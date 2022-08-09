package dataMessage;

import java.io.Serializable;

public class ChessMessage implements Serializable{
	private int X;
	private int Y;
	private boolean isBlack;
	public ChessMessage(int x, int y, boolean isBlack) {
		super();
		X = x;
		Y = y;
		this.isBlack = isBlack;
	}
	
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	public boolean isBlack() {
		return isBlack;
	}
	public void setBlack(boolean isBlack) {
		this.isBlack = isBlack;
	}
	

}
