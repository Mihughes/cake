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
	
	public boolean isHittingBall() {
		return true;
	}

}
