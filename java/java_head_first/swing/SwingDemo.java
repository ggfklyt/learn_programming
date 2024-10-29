import javax.swing.*;
import java.awt.BorderLayout;

public class SwingDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("click me");
		frame.getContentPane().add(BorderLayout.EAST, button);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
