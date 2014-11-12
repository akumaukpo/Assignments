package comboBoxes;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxSwing {
	String month[] = { "1,January", "2, February", "3,March", "4,April","5,May", "6,June", "7,July", "8,August","9,September", "10,October","11,November","12,December" };
	String day[] = { "1", "2", "3", "4","5", "6", "7", "8","9", "10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	String year[] = {"2009", "2010", "2011", "2012", "2013","2014","2015", "2016", "2017", "2018", "2019"};
	JLabel monthJLabel, dayJLabel, yearJLabel;

	public CheckBoxSwing() {
		JFrame frame = new JFrame("ComboBox Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentpane = frame.getContentPane();

		Date date = new Date();
		GregorianCalendar calendar = new GregorianCalendar();

		monthJLabel = new JLabel("Month");
		dayJLabel = new JLabel("Day");
		yearJLabel = new JLabel("Year");

		JComboBox comboBox1 = new JComboBox(month);
		int month = calendar.get(calendar.MONTH);
		comboBox1.setSelectedIndex(month);
		contentpane.add(monthJLabel);
		contentpane.add(comboBox1);

		JComboBox comboBox2 = new JComboBox(day);
		int day = calendar.get(calendar.DAY_OF_MONTH);
		comboBox2.setSelectedIndex(day-1);
		contentpane.add(dayJLabel);
		contentpane.add(comboBox2);

		JComboBox comboBox3 = new JComboBox(year);
		comboBox3.setSelectedIndex(5);
		contentpane.add(yearJLabel);
		contentpane.add(comboBox3);



		frame.setLayout(new FlowLayout());
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	public static void main(String args[]) {

		CheckBoxSwing checkBoxSwing = new CheckBoxSwing();

	}
}
