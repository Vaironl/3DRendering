package ferrari.geometry;

public class Triangle3D
{
	private Point3D pointA;
	private Point3D pointB;
	private Point3D pointC;
	private Vector3D normal;
	
	public Triangle3D(Point3D a, Point3D b, Point3D c, Vector3D norm)
	{
		setPointA(a);
		setPointB(b);
		setPointC(c);
		setNormal(norm);
	}
	
	public Triangle3D(Point3D a, Point3D b, Point3D c)
	{
		this(a, b, c, null);
	}
	
	public Point3D getPointA()
	{
		return pointA;
	}
	
	public Point3D getPointB()
	{
		return pointB;
	}
	
	public Point3D getPointC()
	{
		return pointC;
	}
	
	public Vector3D getNormal()
	{
		return normal;
	}
	
	public void setPointA(Point3D a)
	{
		pointA = a;
	}
	
	public void setPointB(Point3D b)
	{
		pointB = b;
	}
	
	public void setPointC(Point3D c)
	{
		pointC = c;
	}
	
	public void setNormal(Vector3D norm)
	{
		normal = norm;
	}
}
