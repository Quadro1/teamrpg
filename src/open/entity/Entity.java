package open.entity;

import java.awt.Graphics2D;
import java.util.ArrayList;

import open.Constants;
import open.events.Event;

public abstract class Entity {

	public Entity( String name, int absX, int absY ) {
		this.name = name;
		this.absX = absX;
		this.absY = absY;
		this.x = absX * Constants.tileSize;
		this.y = absY * Constants.tileSize;
	}
	
	public abstract void draw( Graphics2D g );
	
	public String getName() {
		return name;
	}
	public int getAbsX() {
		return absX;
	}
	public int getAbsY() {
		return absY;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	protected String name;
	protected int x, y, absX, absY;//abs vars will be tile values
	protected ArrayList<Event> events = new ArrayList<Event>();
}
