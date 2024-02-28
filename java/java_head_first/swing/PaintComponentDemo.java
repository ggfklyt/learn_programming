import java.awt.*;
import javax.swing.*;

public class PaintComponentDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("click me!");
		JPanel myDrawPanel = new MyDrawPanel();

		frame.getContentPane().add(button);
		frame.getContentPane().add(myDrawPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}

class MyDrawPanel extends JPanel {
	public void paintComponent(Graphics g) {
		Image image = new ImageIcon("spaniel.jpg").getImage();
		g.drawImage(image, 3, 4, this);
	}
}
