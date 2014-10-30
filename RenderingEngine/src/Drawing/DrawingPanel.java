package Drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

import Geometry.Point3D;

public class DrawingPanel extends JPanel implements ActionListener {

	Timer timer = new Timer(60, this);

	Point3D[][] points = new Point3D[400][300];
	Random rand = new Random();

	public DrawingPanel() {
		timer.start();

		// Very inefficient way to draw a square area of points
		for (int x = 0; x < points.length; x++) {
			for (int y = 0; y < points[0].length; y++) {
				points[x][y] = new Point3D(x, y, 0);
			}
		}
	}

	@Override
	public void paint(Graphics g) {

		// g2d will handle the drawing
		Graphics2D g2d = (Graphics2D) g;

		for (int x = 0; x < points.length; x++) {
			for (int y = 0; y < points[0].length; y++) {
				// randomize color

				Color randomColor = new Color(rand.nextInt(255), rand.nextInt(255),
						rand.nextInt(255));
				g2d.setColor(randomColor);
				points[x][y].draw(g2d);
			}
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// repaint the panel
		repaint();
		System.out.println("Works");

	}

}
