package ferrari;

public class Entity
{
	private Triangle3D[] polygons;
	
	public Entity(Triangle[] poly)
	{
		setPolygons(poly);
	}
	
	public Triangle3D[] getPolygons()
	{
		return polygons;
	}
	
	public void setPolygons(Triangle3D[] poly)
	{
		polygons = poly;
	}
}
