package open.world;

import java.util.ArrayList;

import open.entity.Entity;

public class WorldHandler implements Runnable {

	@Override
	public void run() {
		while( true ) {
			try {
				for( int index = 0; index < world.size(); index ++ ) {
					
				}
				
				Thread.sleep( 1 );
			} catch( Exception e ) {
				e.printStackTrace();
			}
		}
	}
	
	public ArrayList<Entity> getWorld() {
		return world;
	}
	
	ArrayList<Entity> world = new ArrayList<Entity>();
}
