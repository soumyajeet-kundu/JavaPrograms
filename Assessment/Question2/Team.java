import java.util.ArrayList;
import java.util.List;

public class Team {
	private String Name;

	ArrayList<Player1> al = new ArrayList<Player1>();
	
	

	public Team() {
		super();
	}

	public Team(String Name, ArrayList<Player1> al) {
		super();
		this.Name = Name;
		this.al = al;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public ArrayList<Player1> getAl() {
		return al;
	}

	public void setPlayerList(ArrayList<Player1> al) {
		this.al = al;
	}
	public void addPlayerToTeam(Player1 p1) {
		al.add(p1);
		System.out.println("Player "+(p1).getName()+" successfully added");
	}
	
	public Boolean removePlayerFromTeam(String Name) {
		
		if(al.contains(Name)) {
			
			
		al.remove(Name);
		return true;
		}
		else 
		return false;
		
	}
	
	public void displayPlayers() {
		
		if(al.contains(Name)) {
			System.out.println(al);
		}
		else
		{
			System.out.println("No Players to show named" + Name);
		
	}
	
}}
