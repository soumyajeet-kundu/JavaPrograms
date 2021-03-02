public class Team1{
	String name;  
	int numberOfMatches;
	
	
	public Team1(String name, int numberOfMatches) {
		super();
		this.name = name;
		this.numberOfMatches = numberOfMatches;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	@Override
	public String toString() {
		return "name: " + name +  "numberOfMatches: " + numberOfMatches;
	}
		
}
