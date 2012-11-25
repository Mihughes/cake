package mainCode;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class SaveTheCake extends JPanel implements MouseListener{  
	public static final int FRAME_SIZE_X = 700;
	public static final int FRAME_SIZE_Y = 500;
	private Ball ball;
	private Canon canon;
	private Bullet bullet;
	private Cake cake;
	
	public SaveTheCake() {
		ball = new Ball(FRAME_SIZE_X - 50, 50, 50, Color.GREEN);
		canon = new Canon(100, FRAME_SIZE_Y - 50, 45);
		bullet = new Bullet();
		cake = new Cake();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		ball.draw(g);
		canon.draw(g);
		bullet.draw(g,  200, 80, 100);
		cake.draw(g, 400, 440);
	}
	
	// mouse methods
	@Override
	public void mouseClicked(MouseEvent arg0) {}

	@Override
	public void mouseEntered(MouseEvent arg0) {}

	@Override
	public void mouseExited(MouseEvent arg0) {}
		
	@Override
	public void mousePressed(MouseEvent arg0) {}
		
	@Override
	public void mouseReleased(MouseEvent arg0) {}

}
