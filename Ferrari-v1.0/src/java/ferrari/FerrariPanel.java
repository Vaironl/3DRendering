package ferrari;

import javax.swing.JPanel;

import ferrari.geometry.Point3D;
import ferrari.loader.ModelLoader;

import java.awt.Graphics;
import java.io.File;
import java.util.ArrayList;

public class FerrariPanel extends JPanel {
	private Scene scene;
	private Camera camera;
	private ModelLoader model;

	private ArrayList<Point3D> vertices = new ArrayList<>();

	public FerrariPanel() {
		super();

		File object = new File("src\\teapot.obj.txt");

		model = new ModelLoader(object);

		vertices = model.getVertices();

	}

	public FerrariPanel(Scene scene, Camera camera) {
		this();
		setScene(scene);
		setCamera(camera);
	}

	public Scene getScene() {
		return scene;
	}

	public Camera getCamera() {
		return camera;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

	}
}
