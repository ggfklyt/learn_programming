import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ChangeCircleColorAndLabelText {
	JFrame frame = new JFrame();
	JLabel label = new JLabel("some text");

	public static void main(String[] args) {
		ChangeCircleColorAndLabelText gui = new ChangeCircleColorAndLabelText();
		gui.go();
	}

	public void go() {
		JPanel drawPanel = new MyDrawPanel();
		JButton labelButton = new JButton("change text");
		JButton colorButton = new JButton("change circle color");

		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.WEST, label);
		frame.getContentPane().add(BorderLayout.EAST, labelButton);
		frame.getContentPane().add(BorderLayout.SOUTH, colorButton);

		colorButton.addActionListener(new ColorButtonListener());
		labelButton.addActionListener(new LabelButtonListener());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	class ColorButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			frame.repaint();
		}
	}

	class LabelButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			label.setText("Text changed!");
		}
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
