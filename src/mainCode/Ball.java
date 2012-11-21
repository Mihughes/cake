package mainCode;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Point2D;

public class Ball {
	private double x;
	private double y;
	private double diameter;
	private Color color;
	private double slope;
	
	
	public double getSlope() {
		return slope;
	}

	public void setSlope(double slope) {
		this.slope = slope;
	}

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
	
	public boolean intersect() {
		return false;
	}
	
	public void setPosition(double x, double y) {
		
	}
	
	public Point2D.Double getPosition() {
		return new Point2D.Double();
	}

	public double calculateXPosition(double d) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double calculateYPosition(double d) {
		// TODO Auto-generated method stub
		return 0;
	}

}
