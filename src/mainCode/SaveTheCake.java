package mainCode;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
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
	private Image bground;
	
	public SaveTheCake() {
		this.bground = new ImageIcon("background.png").getImage();
		ball = new Ball(FRAME_SIZE_X - OFFSET - 15, OFFSET - 40 , OFFSET, Color.GREEN);
		canon = new Canon(10, FRAME_SIZE_Y - 80, 45);
		bullet = new Bullet(100, FRAME_SIZE_Y - OFFSET, OFFSET);
		cake = new Cake(FRAME_SIZE_X - 230, FRAME_SIZE_Y - 150);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.drawImage(bground, 1, 1, null);
		canon.draw(g);
		bullet.draw(g);
		cake.draw(g);
		ball.draw(g);
	}
	
	public void mainFlow(){
		while (!cake.intersect(ball)){
			try {
			    Thread.sleep(50);
			} catch(InterruptedException e) {
				System.out.println(e);
			}
			ball.rolling();
			repaint();
		}
		repaint();
	}
	
	public Ball getBall() {
		return ball;
	}

	public Canon getCanon() {
		return canon;
	}

	public Bullet getBullet() {
		return bullet;
	}

	public Cake getCake() {
		return cake;
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
