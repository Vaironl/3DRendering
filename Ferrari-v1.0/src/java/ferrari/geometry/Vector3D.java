package ferrari.geometry;

public class Vector3D
{
	public float x;
	public float y;
	public float z;

	public Vector3D(float x, float y, float z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double magnitude()
	{
		return Math.sqrt(x*x + y*y + z*z);
	}
	
	public void normalize()
	{
		double length = magnitude();
		
		x /= length;
		y /= length;
		z /= length;
	}
	
	public double dotproduct(Vector3D other)
	{
		return Math.sqrt(other.x * this.x +
				 other.y * this.y +
				 other.z * this.z);
	}
	
	public Vector3D crossproduct(Vector3D other)
	{
		return new Vector3D(this.y * other.z - this.z * other.y,
				    this.z * other.x - this.x * other.z,
				    this.x * other.y - this.y * other.x);
	}
	
	@Override
	public String toString()
	{
		return "<" + x, ", " + y + ", " + z + ">";
	}
}
