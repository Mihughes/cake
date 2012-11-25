package mainCode;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class ControlPanel extends JPanel{
	private JButton shootButton;
	private JSlider angleSlider;
	public static final int ANGLE_MIN = 0;
	public static final int ANGLE_MAX = 90;
	public ControlPanel() {
		setLayout(new BorderLayout());
		shootButton = new JButton("Shoot");
		angleSlider = new JSlider(JSlider.VERTICAL, ANGLE_MIN, ANGLE_MAX, 45 );
		angleSlider.setMajorTickSpacing(10);
		angleSlider.setMinorTickSpacing(5);
		angleSlider.setPaintTicks(true);
		angleSlider.setPaintLabels(true);
		add(angleSlider, BorderLayout.CENTER);
		add(shootButton, BorderLayout.SOUTH);
	}
}
