package mainCode;

import java.awt.Color;
import java.awt.Graphics;

public class Cake {
	private double x;
	private double y;
	
	public void draw(Graphics g, double x, double y) {
		g.setColor(Color.PINK);
		g.drawString("Cake", (int)x, (int)y);
		drawSmashed(g,  x,  y + 10);
		drawPanick(g, x, y + 20);
		
	}
	
	private void drawSmashed(Graphics g, double x, double y ) {
		g.drawString("Smashed cake", (int)x , (int)y);
	}
	
	private void drawPanick(Graphics g, double x, double y) {
		g.drawString("Panic cake", (int)x, (int)y);
	}
	
	public boolean intersect(Ball ball){
		return false;
	}

	public boolean inPanick() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
