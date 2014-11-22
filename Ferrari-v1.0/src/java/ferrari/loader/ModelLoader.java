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
            			String[] vertIndex = line.split(' ');
            
            			for (String s : vertIndex)
            			{
               				if (s.contains("/"))
                  				s = s.substring(0, s.indexOf("/"));
            			}
            
            			int indexA = Integer.parseInt(vertIndex[1]) - 1;
            			int indexB = Integer.parseInt(vertIndex[2]) - 1;
            			int indexC = Integer.parseInt(vertIndex[3]) - 1;
            
            			faces.add(new Triangle(vertices.get(indexA),
                                   		       vertices.get(indexB),
                                  		       vertices.get(indexC)));
         		}
      		}
      
      		Triangle3D[] mesh;
      
      		return new Entity(faces.toArray(mesh));    
   	}
}
