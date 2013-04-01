package open;

import open.entity.*;
import open.entity.team.Team;
import open.gui.Frame;
import open.world.WorldHandler;

public class Main {

	public Main() {
		frame = new Frame();
		worldHandler = new WorldHandler();
		
		/** testing entitys and teams **/
		Team rocket = new Team("Pros");
		Entity_Player tester = new Entity_Player( "Venus", 3, 3 );
		worldHandler.getWorld().add( tester );
		Entity_Player tester2 = new Entity_Player( "Mars", 5, 3 );
		worldHandler.getWorld().add( tester2 );
		Entity_Player tester3 = new Entity_Player( "Neptune", 4, 5 );
		worldHandler.getWorld().add( tester3 );
		rocket.addMember( tester );
		rocket.addMember( tester2 );
		rocket.addMember( tester3 );
		System.out.println( rocket.getMembers() );
	}
	
	public static void main(String[] args) {
		new Main();
	}

	public Frame frame;
	public static WorldHandler worldHandler;
}
