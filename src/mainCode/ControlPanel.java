package mainCode;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ControlPanel extends JPanel{
	private JButton shootButton;
	private JSlider angleSlider;
	public static final int ANGLE_MIN = 0;
	public static final int ANGLE_MAX = 90;
	private SaveTheCake gamePanel;
	private AnglePanel panel;
	
	public ControlPanel(SaveTheCake gamePanel) {
		this.gamePanel = gamePanel;
		setLayout(new BorderLayout());
		shootButton = new JButton("Shoot");
		angleSlider = new JSlider(JSlider.VERTICAL, ANGLE_MIN, ANGLE_MAX, 45 );
		angleSlider.addChangeListener(new SliderListener());
		angleSlider.setMajorTickSpacing(10);
		angleSlider.setMinorTickSpacing(5);
		angleSlider.setPaintTicks(true);
		angleSlider.setPaintLabels(true);
		panel = new AnglePanel(angleSlider);
		add(panel, BorderLayout.NORTH);
		add(angleSlider, BorderLayout.CENTER);
		add(shootButton, BorderLayout.SOUTH);
		setBorder(new TitledBorder (new EtchedBorder(), "Control"));
	}
	
	class SliderListener implements ChangeListener {
	    public void stateChanged(ChangeEvent e) {
	    	gamePanel.getCanon().setAngle(angleSlider.getValue());
	    	panel.setText(angleSlider.getValue());
	    }
	}
}
