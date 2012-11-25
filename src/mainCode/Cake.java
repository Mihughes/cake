package mainCode;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.geom.Ellipse2D;

public class Cake {
	private int x;
	private int y;
	
	public Cake(){
		this.x = 450;
		this.y = 450;
	}
	
	public Cake(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.PINK);
		g.drawString("Cake", x, y);
		drawSmashed(g);
		drawPanick(g);
		
	}
	
	private void drawSmashed(Graphics g) {
		g.drawString("Smashed cake", x , y);
	}
	
	private void drawPanick(Graphics g) {
		g.drawString("Panic cake", x, y);
	}
	
	public boolean intersect(Ball ball){
		for (int i = x; i < x + 51; i++){
			for (int j = y; j > y - 51; j--)
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
