package mainCode;

import java.awt.Color;
import java.awt.Graphics;

public class Canon {
	private double x;
	private double y;
	private double angle;
	
	public void draw(Graphics g, double x, double y, double angle) {
		g.setColor(Color.DARK_GRAY);
		g.drawString("Canon", (int)x, (int)y);
		drawAngle(g, x, y, angle);
	}
	
	public void drawAngle(Graphics g, double x, double y, double angle) {
		g.setColor(Color.BLUE);
		g.drawString("Draw Angle arc", (int)x+20, (int)y+20);
	}
	
	

}
