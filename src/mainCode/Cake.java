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
	private boolean smashed;
	
	public Cake(){
		this.x = 450;
		this.y = 450;
	}
	
	public Cake(double x, double y){
		this.cake = new ImageIcon("cake.png").getImage();
		this.x = x;
		this.y = y;
		this.smashed = false;
	}
	
	public void draw(Graphics g) {
		if (smashed)
			this.cake = new ImageIcon("smashed.png").getImage();
		g.drawImage(cake, (int) x, (int) y, null);
	}
	
	private void drawPanick(Graphics g) {
		g.drawString("Panic cake", (int) x, (int) y);
	}
	
	public boolean intersect(Ball ball){
		int i = (int) x;
		for (int j = (int) y - 10 ; j < y + 1; j++)
			if (Math.sqrt((ball.getX()-i)*(ball.getX()-i) + (ball.getY()-j)*(ball.getX()-j)) <= ball.getDiameter()/2){
				smashed = true;
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
