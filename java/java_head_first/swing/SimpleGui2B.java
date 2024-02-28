import javax.swing.*;
import java.awt.event.*;

public class SimpleGui2B implements ActionListener {
	JButton button = new JButton("Click me");

	public static void main(String[] args) {
		SimpleGui2B gui = new SimpleGui2B();
		gui.go();
	}

	private void go() {
		JFrame frame = new JFrame();
		button.addActionListener(this);

		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent event) {
		changeIt();
	}

	private void changeIt() {
		button.setText("I've been clicked!");
	}
}
