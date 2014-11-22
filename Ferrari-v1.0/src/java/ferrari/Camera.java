package ferrari;

import ferrari.geometry.Point3D;
import ferrari.geometry.Vector3D;

public class Camera
{
	private Point3D position;
	private Vector3D orientation;

	public Camera(Point3D pos, Vector3D ori)
	{
		setPosition(pos);
		setOrientation(ori);
	}

	public Camera()
	{
		this(new Point3D(0, 0, 0), new Vector3D(0, 0, 1));
	}

	public Point3D getPosition()
	{
		return position;
	}

	public Vector3D getOrientation()
	{
		return orientation;
	}

	public void setPosition(Point3D pos)
	{
		position = pos;
	}

	public void setOrientation(Vector3D ori)
	{
		orientation = ori;
	}
}
