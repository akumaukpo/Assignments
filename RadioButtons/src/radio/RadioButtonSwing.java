package radio;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class RadioButtonSwing extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JRadioButton jRadioButton1;
	private JRadioButton jRadioButton2;
	private JRadioButton jRadioButton3;

	public RadioButtonSwing() {

		addRadiButton();
		this.setSize(300,300);
		this.setLayout( new FlowLayout());
		this.setVisible(true);
	}

	public ButtonGroup addRadiButton(){
		ButtonGroup bg1 = new ButtonGroup( );

		jRadioButton1 = new JRadioButton("Small");
		jRadioButton2 = new JRadioButton("Medium");
		jRadioButton3 = new JRadioButton("Large");

		bg1.add(jRadioButton1);
		bg1.add(jRadioButton2);
		bg1.add(jRadioButton3);


		getContentPane().add(jRadioButton1);
		getContentPane().add(jRadioButton2);
		getContentPane().add(jRadioButton3);

		jRadioButton1.setSelected(true);

		return bg1;
	}

	public static void main(String[] args) {
		RadioButtonSwing radioButtonSwing = new RadioButtonSwing();

	}
}
