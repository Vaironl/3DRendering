package ferrari;

import javax.swing.JPanel;
import java.awt.Graphics;

public class FerrariPanel extends JPanel
{
	private Scene scene;
	private Camera camera;

	public FerrariPanel()
	{
		super();
	}

	public FerrariPanel(Scene scene, Camera camera)
	{
		this();
		setScene(scene);
		setCamera(camera);
	}

	public Scene getScene()
	{
		return scene;
	}

	public Camera getCamera()
	{
		return camera;
	}

	public void setScene(Scene scene)
	{
		this.scene = scene;
	}

	public void setCamera(Camera camera)
	{
		this.camera = camera;
	}

	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	}
}
