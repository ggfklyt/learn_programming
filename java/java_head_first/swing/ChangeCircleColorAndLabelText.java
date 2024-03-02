import javax.swing.*;
import java.awt.*;

public class ChangeCircleColorAndLabelText {
	JFrame frame = new JFrame();

	public static void main(String[] args) {
		ChangeCircleColorAndLabelText gui = new ChangeCircleColorAndLabelText();
		gui.go();
	}

	public void go() {
		JButton colorButton = new JButton("change circle color");
		JButton labelButton = new JButton("change text");
		JLabel label = new JLabel("some text");
		JPanel drawPanel = new MyDrawPanel();

		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.WEST, label);
		frame.getContentPane().add(BorderLayout.EAST, labelButton);
		frame.getContentPane().add(BorderLayout.SOUTH, colorButton);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}

class MyDrawPanel extends JPanel {
	public void paintComponent(Graphics g) {
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);

		Color randomColor = new Color(red, green, blue);
		g.setColor(randomColor);
		g.fillOval(20, 20, 50, 50);
	}
}
