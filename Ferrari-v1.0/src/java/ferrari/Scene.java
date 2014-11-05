package ferrari;

public class Scene
{
	private ArrayList<Entity> entities;
	
	public Scene()
	{
		new ArrayList<Entity>();
	}
	
	public Entity[] getEntities()
	{
		return entites.toArray();
	}
	
	public void setEntities(ArrayList<Entity> ent)
	{
		entities = ent;
	}
	
	public void add(Entity ent)
	{
		entities.add(ent);
	}
	
	public void remove(Entity ent)
	{
		entities.remove(ent);
	}
}
