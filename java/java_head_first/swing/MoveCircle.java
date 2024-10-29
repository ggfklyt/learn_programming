import javax.swing.*;
import java.awt.*;

public class MoveCircle {
	int x = 70;
	int y = 70;

	public static void main(String[] args) {
		MoveCircle gui = new MoveCircle();
		gui.go();
	}

       private void go() {	
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new MyDrawPanel();

		frame.getContentPane().add(panel);
		frame.setSize(300, 300);
		frame.setVisible(true);

		for (int i = 0; i < 250; i++) {
			x++;
			y++;
			panel.repaint();
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	class MyDrawPanel extends JPanel {
		public void paintComponent(Graphics g) {
			g.setColor(Color.white);
			g.fillRect(0, 0, getWidth(), getHeight());

			g.setColor(Color.green);
			g.fillOval(x, y, 50, 50);
		}
	}
}
