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
	
	public Ball(double x, double y, double diameter, Color color){
		this.x = x;
		this.y = y;
		this.diameter = diameter;
		this.color = color;
		this.slope = 18;
	}
	
	public Ball(){
		this.x = 80;
		this.y = 80;
		this.slope = 45;
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
		g.fillOval((int) x, (int) y, (int) diameter, (int) diameter);
	}
	
	public void getIcon () {
		System.out.println("at Ball.getIcon()");
	}
	
	public void rolling() {
		setPosition(calculateXPosition(5),calculateYPosition(5));
	}
	
	public void explode () {
		System.out.println("at Ball.explode()");
	}
	
	public boolean intersect() {
		return false;
	}
	
	public void setPosition(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point2D.Double getPosition() {
		return new Point2D.Double();
	}

	public double calculateXPosition(double d) {
        return Math.round(x - (d  * Math.sin(Math.toRadians(slope)))); 
    }

    public double calculateYPosition(double d) {
        return Math.round(y + (d  * Math.cos(Math.toRadians(slope))));
    }

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getDiameter() {
		return diameter;
	}
}
