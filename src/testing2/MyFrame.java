package testing2;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComponent;

import java.awt.*;


public class MyFrame extends JFrame {

	public MyFrame() {
		super("MyFrame");
		setLocation(100, 100);
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		add(new JButton("one"));
		add(new JButton("two"));
		add(new JButton("three"));
		setVisible(true);
	}
}
