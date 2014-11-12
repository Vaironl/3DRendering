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
	
	public FerrariPanel(Scene scn, Camera cam)
	{
		this();
		setScene(scn);
		setCamera(cam);
	}
	
	public Scene getScene()
	{
		return scene;
	}
	
	public Camera getCamera()
	{
		return camera;
	}
	
	public void setScene(Scene scn)
	{
		scene = scn;
	}
	
	public void setCamera(Camera cam)
	{
		camera = cam;
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		//Here is where the magic will happen.
	}
}
