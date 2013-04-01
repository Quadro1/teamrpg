package open.entity;

import java.awt.Color;
import java.awt.Graphics2D;

public class Entity_Player extends Entity {

	public Entity_Player( String name, int absX, int absY) {
		super( name, absX, absY);
	}

	@Override
	public void draw(Graphics2D g) {
		
		g.setColor( Color.green );
		g.fillRect( x, y, 20, 20);
		
		g.setColor( Color.black );
		g.drawString( name, x, y+30 );
	}

}
