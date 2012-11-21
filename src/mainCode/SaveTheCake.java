package mainCode;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class SaveTheCake extends JPanel implements MouseListener{  
	private static int frameSizeX;
	private static int frameSizeY;
	Ball ball = new Ball();
	Canon canon = new Canon();
	Bullet bullet = new Bullet();
	Cake cake = new Cake();
	
	public SaveTheCake() {
		frameSizeX = 500;
		frameSizeY = 500;
	}
	
	
	public void paintComponent(Graphics g) {
		ball.draw(g, 80, 80, 20, Color.CYAN);
		canon.draw(g, 10, 80, 45);
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
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		SaveTheCake saveTheCake = new SaveTheCake();
		frame.setContentPane(saveTheCake);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(frameSizeX,frameSizeY);
		frame.setBackground(Color.BLACK);
		frame.setVisible(true);

	}

}
