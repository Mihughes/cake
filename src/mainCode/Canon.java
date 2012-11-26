package mainCode;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Canon {
	private double x;
	private double y;
	private double angle;
	private Image canon;
	
	public Canon(){
		this.x = 10;
		this.y = 80;
		this.angle = 45;
	}
	
	public Canon(int x, double y, double angle){
		this.canon = new ImageIcon("cannon.png").getImage();
		this.x = x;
		this.y = y;
		this.angle = angle;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		g.drawImage(canon, (int) x, (int) y, null);
		drawAngle(g);
	}
	
	public void drawAngle(Graphics g) {
		g.setColor(Color.BLUE);
	}
	
	

}
