package mainCode;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Ball {
	private double x;
	private double y;
	private double diameter;
	private Color color;
	
	public void draw(Graphics g, double x, double y, double diameter, Color color ) {
		//Graphics2D g2 = (Graphics2D) g;
		g.setColor(color);
		g.drawString("DrawBall", (int)x, (int)y);
	}
	
	public void getIcon () {
		System.out.println("at Ball.getIcon()");
	}

	public void rolling() {
		System.out.println("at Ball.rolling().");
	}
	
	public void explode () {
		System.out.println("at Ball.explode()");
	}
	

}
