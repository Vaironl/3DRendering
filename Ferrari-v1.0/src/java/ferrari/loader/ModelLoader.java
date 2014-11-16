package ferrari.loader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import ferrari.geometry.Point3D;

public class ModelLoader {
	private ArrayList<Point3D> vertices = new ArrayList<Point3D>();
	private ArrayList<Point3D> faces = new ArrayList<Point3D>();

	public ModelLoader(File file) {

		parseFile(file);
	}

	public ArrayList<Point3D> getVertices() {
		return vertices;
	}

	public ArrayList<Point3D> getFaces() {
		return faces;
	}

	private void parseFile(File file) {
		Scanner fileScanner = null;

		try {
			fileScanner = new Scanner(file);

			int vertexCount = 0;
			int faceCount = 0;

			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();

				// number of verticies
				if (line.length() > 1) {
					if (line.charAt(0) == 'v' && line.charAt(1) == ' ') {

						String v[] = line.substring(2, line.length())
								.split(" ");

						float x = Float.valueOf(v[0]);
						float y = Float.valueOf(v[1]);
						float z = Float.valueOf(v[2]);

						vertices.add(new Point3D(x, y, z));

						vertexCount++;
					}

					// number of faces
					if (line.charAt(0) == 'f' && line.charAt(1) == ' ') {

						String v[] = line.substring(2, line.length())
								.split(" ");

						float x = Float.valueOf(v[0]);
						float y = Float.valueOf(v[1]);
						float z = Float.valueOf(v[2]);

						faces.add(new Point3D(x, y, z));

						faceCount++;
					}
				}

			}

			System.out.println("vertices: " + vertexCount);
			System.out.println("Face count: " + faceCount);

		} catch (FileNotFoundException e) {
			System.out.println("Error parsing the .obj file");
			e.printStackTrace();
		}

	}
}
