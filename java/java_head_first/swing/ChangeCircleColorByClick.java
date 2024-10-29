import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ChangeCircleColorByClick implements ActionListener {
	JFrame frame = new JFrame();

	public static void main(String[] args) {
		ChangeCircleColorByClick gui = new ChangeCircleColorByClick();
		gui.go();
	}


	public void go() {
		frame.setSize(300, 300);
		JPanel drawPanel = new MyDrawPanel();

		JButton button = new JButton("Change circle color!");
		button.addActionListener(this);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent event) {
		frame.repaint();
	}
}

class MyDrawPanel extends JPanel {
	public void paintComponent(Graphics g) {
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);

		Color randomColor = new Color(red, green, blue);
		g.setColor(randomColor);

		g.fillOval(20, 50, getWidth() / 2, getHeight() / 2);
	}
}
