package mainCode;

import java.awt.Color;
import java.awt.Graphics;

public class Canon {
	private double x;
	private double y;
	private double angle;
	
	public Canon(){
		this.x = 10;
		this.y = 80;
		this.angle = 45;
	}
	
	public Canon(int x, double y, double angle){
		this.x = x;
		this.y = y;
		this.angle = angle;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		g.drawString("Canon", (int) x, (int) y);
		drawAngle(g);
	}
	
	public void drawAngle(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawString("Draw Angle arc", (int) x+20, (int) y+20);
	}
	
	

}
