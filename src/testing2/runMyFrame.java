//testing my frame.java
package testing2;

import java.awt.EventQueue;

public class runMyFrame {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MyFrame();
			}
		});
	}
}