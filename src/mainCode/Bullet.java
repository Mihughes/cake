package mainCode;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.geom.Ellipse2D;

public class Bullet {
	private double x;
	private double y;
	private double velocity;
	
	public Bullet(){
		this.x = 200;
		this.y = 80;
		this.velocity = 100;
	}
	
	public Bullet(double x, double y, double velocity){
		this.x = x;
		this.y = y;
		this.velocity = velocity;
	}
	
	public void draw(Graphics g) {
		g.drawString("Bullet", (int) x, (int) y);
	}
	
	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}
	
	public void setInitialAngle(double angle) {
		
	}
	
	public boolean intersect(Ball ball) {
		Ellipse2D.Double circle = new Ellipse2D.Double(ball.getX(), ball.getY(), ball.getDiameter(), ball.getDiameter());
		for (int i = (int) x - 5; i < x + 6; i++){
			for (int j = (int) y - 5; j < y + 6; j++){
				if (circle.contains(new Point(i, j)))
					return true;
			}
		}
		return false;
	}
	
	public boolean isHittingBall() {
		return true;
	}
	
	public void setPosition(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double calculateXPosition(double d) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double calculateYPosition(double time) {
		// TODO Auto-generated method stub
		return 0;
	}

}
