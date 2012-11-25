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
	public static final int OFFSET = 50;
	private Ball ball;
	private Canon canon;
	private Bullet bullet;
	private Cake cake;
	
	public SaveTheCake() {
		ball = new Ball(FRAME_SIZE_X - OFFSET, OFFSET, OFFSET, Color.GREEN);
		canon = new Canon(100, FRAME_SIZE_Y - OFFSET, OFFSET);
		bullet = new Bullet(100, FRAME_SIZE_Y - OFFSET, OFFSET);
		cake = new Cake(FRAME_SIZE_X - 250, FRAME_SIZE_Y - OFFSET);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		ball.draw(g);
		canon.draw(g);
		bullet.draw(g);
		cake.draw(g);
	}
	
	public void mainFlow(){
		
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
