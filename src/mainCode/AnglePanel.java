package mainCode;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;

public class AnglePanel extends JPanel{
	private JLabel label;
	private JTextArea currentAngle;
	
	public AnglePanel(JSlider slider){
		setLayout(new BorderLayout());
		label = new JLabel("Angle");
		currentAngle = new JTextArea();
		currentAngle.setEditable(false);
		currentAngle.setText(((Integer) slider.getValue()).toString());
		add(label, BorderLayout.NORTH);
		add(currentAngle, BorderLayout.CENTER);
	}
	
	public void setText(int value){
		currentAngle.setText(((Integer) value).toString());
	}
}
