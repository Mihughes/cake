package mainCode;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.geom.Ellipse2D;

import javax.swing.ImageIcon;

public class Cake {
	private double x;
	private double y;
	private Image cake;
	
	public Cake(){
		this.x = 450;
		this.y = 450;
	}
	
	public Cake(double x, double y){
		this.cake = new ImageIcon("cake.png").getImage();
		this.x = x;
		this.y = y;
	}
	
	public void draw(Graphics g) {
		g.drawImage(cake, (int) x, (int) y, null);
	}
	
	private void drawSmashed(Graphics g) {
		g.drawString("Smashed cake", (int) x , (int) y);
	}
	
	private void drawPanick(Graphics g) {
		g.drawString("Panic cake", (int) x, (int) y);
	}
	
	public boolean intersect(Ball ball){
		for (int i = (int) x; i < x + 90; i++){
			for (int j = (int) y; j < y + 101; j--)
				if (Math.sqrt((ball.getX()-x)*(ball.getX()-x) + (ball.getY()-y)*(ball.getX()-x)) <= ball.getDiameter()/2)
					return true;
		}
		return false;
	}

	public boolean inPanick(Ball ball) {
		for (int i = (int) x; i < x + 101; i++){
			for (int j = (int) y; j > y - 151; j--)
				if (Math.sqrt((ball.getX()-x)*(ball.getX()-x) + (ball.getY()-y)*(ball.getX()-x)) <= ball.getDiameter()/2)
					return true;
		}
		return false;
	}
	

}
