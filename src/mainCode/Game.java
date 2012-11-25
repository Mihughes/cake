package mainCode;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Game extends JFrame{
	private SaveTheCake gamePanel;
	private ControlPanel controlPanel;
	public Game(){
		gamePanel = new SaveTheCake();
		controlPanel = new ControlPanel();
		JOptionPane.showMessageDialog(null, "Please be ready, use the arrow keys to aim and Shoot button to shoot", "Welcome to Save The Cake", JOptionPane.INFORMATION_MESSAGE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(SaveTheCake.FRAME_SIZE_X + 100, SaveTheCake.FRAME_SIZE_Y);
		addFeatures();
		setVisible(true);
	}
	
	public void addFeatures(){
		add(gamePanel, BorderLayout.CENTER);
		add(controlPanel, BorderLayout.WEST);
	}
	
	public static void main(String[] args) {
		Game newGame = new Game();
	}
}
