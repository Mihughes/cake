package mainCode;

import java.awt.Color;
import java.awt.Graphics;

public class Canon {
	private int x;
	private int y;
	private int angle;
	
	public Canon(){
		this.x = 10;
		this.y = 80;
		this.angle = 45;
	}
	
	public Canon(int x, int y, int angle){
		this.x = x;
		this.y = y;
		this.angle = angle;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		g.drawString("Canon", x, y);
		drawAngle(g);
	}
	
	public void drawAngle(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawString("Draw Angle arc", x+20, y+20);
	}
	
	

}
