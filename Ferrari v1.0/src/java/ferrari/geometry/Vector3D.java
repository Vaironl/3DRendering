package Geometry;

public class Vector3D {

	private float x, y, z;

	public Vector3D(float initX, float initY, float initZ) {
		x = initX;
		y = initY;
		z = initZ;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	public double DotProduct(Vector3D vector) {
		return 0.0f;
	}

	public double CrossProduct(Vector3D vector) {
		return 0.0f;
	}

}
