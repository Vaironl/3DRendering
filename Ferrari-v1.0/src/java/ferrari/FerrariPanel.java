package ferrari;

public class FerrariPanel extends javax.swing.JPanel
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
}
