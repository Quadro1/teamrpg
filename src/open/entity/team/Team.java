package open.entity.team;

import java.util.ArrayList;

import open.entity.Entity;
import open.entity.Entity_Player;

public class Team {

	public Team( String name ) {
		teamName = name;
	}
	
	public String getMembers() {
		String membersList = teamName+": ";
		for( int i = 0; i < members.size(); i++ ) {
			membersList += members.get( i ).getName();
			if( i != members.size() - 1 ) {
				membersList += ", ";
			}
		}
		return membersList;
	}
	
	public void addMember( Entity_Player p ) {
		members.add( p );
	}
	
	protected String teamName = "";
	protected ArrayList<Entity> members = new ArrayList<Entity>();
}
