package open.gui;

import java.awt.Graphics2D;

import open.Main;

public class Draw {

	public void render(Graphics2D g) {
		
		for( int i = 0; i < Main.worldHandler.getWorld().size(); i ++ ) {
			Main.worldHandler.getWorld().get( i ).draw( g );
		}
	}
	
}
