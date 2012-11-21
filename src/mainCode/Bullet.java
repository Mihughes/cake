package mainCode;

import java.awt.Graphics;

public class Bullet {
	private double x;
	private double y;
	private double velocity;
	
	public void draw(Graphics g, double x, double y, double velocity) {
		g.drawString("Bullet", (int)x, (int)y);
	}
	
	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}
	
	public void setInitialAngle(double angle) {
		
	}
	
	public boolean intersect(Ball ballObject) {
		return false;
	}
	
	public boolean isHittingBall() {
		return true;
	}
	
	public void setPosition(double x, double y) {
		
	}

	public double calculateXPosition(double time) {
		// TODO Auto-generated method stub
		return 0.0;
	}

	public double calculateYPosition(double time) {
		// TODO Auto-generated method stub
		return 0.0;
	}

}
