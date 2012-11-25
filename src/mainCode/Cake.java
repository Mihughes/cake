package mainCode;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.geom.Ellipse2D;

public class Cake {
	private double x;
	private double y;
	
	public Cake(){
		this.x = 450;
		this.y = 450;
	}
	
	public Cake(int x, double y){
		this.x = x;
		this.y = y;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.PINK);
		g.drawString("Cake", (int) x, (int) y);
		drawSmashed(g);
		drawPanick(g);
		
	}
	
	private void drawSmashed(Graphics g) {
		g.drawString("Smashed cake", (int) x , (int) y);
	}
	
	private void drawPanick(Graphics g) {
		g.drawString("Panic cake", (int) x, (int) y);
	}
	
	public boolean intersect(Ball ball){
		for (int i = (int) x; i < x + 51; i++){
			for (int j = (int) y; j > y - 51; j--)
				if (Math.sqrt((ball.getX()-x)*(ball.getX()-x) + (ball.getY()-y)*(ball.getX()-x)) <= ball.getDiameter()/2)
					return true;
		}
		return false;
	}

	public boolean inPanick() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
