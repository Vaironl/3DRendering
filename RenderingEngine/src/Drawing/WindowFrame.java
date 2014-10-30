package Drawing;

import javax.swing.JFrame;

public class WindowFrame extends JFrame {

	private static final String TITLE = "Rendering Engine 1.0";

	public WindowFrame(int WIDTH, int HEIGHT) {

		// add the panel which will handle the drawing
		add(new DrawingPanel());

		setTitle(TITLE);
		setSize(WIDTH, HEIGHT);
		// center on the screen
		setLocationRelativeTo(null);
		// allows x to close the window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
