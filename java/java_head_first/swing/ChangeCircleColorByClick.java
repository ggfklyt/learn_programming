import javax.swing.*;
import java.awt.*;

public class ChangeCircleColorByClick {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel drawPanel = new MyDrawPanel();
		frame.setSize(300, 300);
		drawPanel.setSize(frame.getWidth() / 2, frame.getHeight() / 2);

		frame.getContentPane().add(drawPanel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class MyDrawPanel extends JPanel {
	public void paintComponent(Graphics g) {
		g.fillRect(0, 0, getWidth(), getHeight());
		
		int red = (int) (Math.random() * 256);
		int green= (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);


		Color randomColor = new Color(red, green, blue);
		g.setColor(randomColor);
	}
}
