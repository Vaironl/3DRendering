package ferrari.loader;

import ferrari.Entity;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import ferrari.geometry.Point3D;
import ferrari.geometry.Triangle3D;

public class ModelLoader
{
	public static Entity load(File objFile)
	{
		Scanner scanner = new Scanner(file);
		
		ArrayList<Point3D> vertices = new ArrayList<Point3D>();
		ArrayList<Triangle3D> faces = new ArrayList<Triangle3D>();
   
   		while (scanner.hasNextLine())
   		{
   			String line = scanner.nextLine();
   			
         		if (line.startsWith("v "))
         		{
         			String[] coordinates = line.split(' ');
            			
            			float x = Float.parseFloat(coodinates[1]);
            			float y = Float.parseFloat(coodinates[2]);
         			float z = Float.parseFloat(coodinates[3]);
            
         			vertices.add(new Point3D(x, y, z));
         		}
         
         		if (line.startsWith("f "))
         		{
            			String[] vertexAttributes = line.split(' ');
            			
            			String[] aAttributes = vertexAttributes[1].split('/');
            			String[] bAttributes = vertexAttributes[2].split('/');
            			String[] cAttributes = vertexAttributes[3].split('/');
            			
            			int aCoordinateIndex = Integer.parseInt(aAttributes[0]) - 1;
            			int bCoordinateIndex = Integer.parseInt(bAttributes[0]) - 1;
            			int cCoordinateIndex = Integer.parseInt(cAttributes[0]) - 1;
            			
            			faces.add(new Triangle3D(vertices.get(aCoordinateIndex),
            						 vertices.get(bCoordinateIndex),
            						 vertices.get(cCoordinateIndex)));
         		}
      		}
      
      		Triangle3D[] mesh;
      
      		return new Entity(faces.toArray(mesh));    
   	}
}
