package ferrari.geometry;

public class Point3D {

	private float x, y, z;

	public Point3D(float initX, float initY, float initZ) {
		x = initX;
		y = initY;
		z = initZ;
	}

	public void draw(Graphics2D g2d) {
		// cast into integers temporary
		g2d.drawLine((int) x, (int) y, (int) x, (int) y);
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

}
