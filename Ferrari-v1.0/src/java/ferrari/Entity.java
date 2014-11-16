package ferrari;

import ferrari.geometry.Triangle3D;

public class Entity {
	private Triangle3D[] mesh;

	public Entity(Triangle3D[] mesh) {
		setMesh(mesh);
	}

	public Triangle3D[] getMesh() {
		return mesh;
	}

	public void setMesh(Triangle3D[] mesh) {
		this.mesh = mesh;
	}
}
