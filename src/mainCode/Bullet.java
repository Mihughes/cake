package mainCode;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.geom.Ellipse2D;

public class Bullet {
	private int x;
	private int y;
	private int velocity;
	
	public Bullet(){
		this.x = 200;
		this.y = 80;
		this.velocity = 100;
	}
	
	public Bullet(int x, int y, int velocity){
		this.x = x;
		this.y = y;
		this.velocity = velocity;
	}
	
	public void draw(Graphics g) {
		g.drawString("Bullet", x, y);
	}
	
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	
	public void setInitialAngle(int angle) {
		
	}
	
	public boolean intersect(Ball ball) {
		Ellipse2D.Double circle = new Ellipse2D.Double(ball.getX(), ball.getY(), ball.getDiameter(), ball.getDiameter());
		for (int i = x - 5; i < x + 6; i++){
			for (int j = y - 5; j < y + 6; j++){
				if (circle.contains(new Point(i, j)))
					return true;
			}
		}
		return false;
	}
	
	public boolean isHittingBall() {
		return true;
	}
	
	public void setPosition(int x, int y) {
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
