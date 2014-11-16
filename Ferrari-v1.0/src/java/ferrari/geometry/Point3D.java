package ferrari.geometry;

public class Point3D {
	public float x;
	public float y;
	public float z;

	public Point3D(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double distanceTo(Point3D other) {
		float dx = other.x - this.x;
		float dy = other.y - this.y;
		float dz = other.z - this.z;

		return Math.sqrt(dx * dx + dy * dy + dz * dz);
	}

	public Vector3D vectorTo(Point3D other) {
		return new Vector3D(other.x - this.x, other.y - this.y, other.z
				- this.z);
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ", " + z + ")";
	}
}
