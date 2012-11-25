package mainCode;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Point2D;

public class Ball {
	private int x;
	private int y;
	private int diameter;
	private Color color;
	private double slope;
	
	public Ball(int x, int y, int diameter, Color color){
		this.x = x;
		this.y = y;
		this.diameter = diameter;
		this.color = color;
	}
	
	public Ball(){
		this.x = 80;
		this.y = 80;
		this.diameter = 20;
		this.color = Color.CYAN;
	}
	
	public double getSlope() {
		return slope;
	}

	public void setSlope(double slope) {
		this.slope = slope;
	}

	public void draw(Graphics g) {
		//Graphics2D g2 = (Graphics2D) g;
		g.setColor(color);
		g.fillOval(x, y, diameter, diameter);
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
	
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
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

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getDiameter() {
		return diameter;
	}
}
