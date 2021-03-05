import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Player1 {
	private String name;
	private Date dateOfBirth;
	private String skill;
	private int numberOfMatches;
	private int runs;
	private int wickets;
	private String nationality;
	private double powRat;
	
	
	public Player1() {
		super();
	}

	public Player1(String name, Date dateOfBirth, String skill, int numberOfMatches, int runs, int wickets,
			String nationality, double powRat) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.skill = skill;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		this.powRat = powRat;
	}
	public Player1(String name2, String  dateOfBirth2, String skill2, String  numberOfMatches2, String  runs2, String  wickets2,
			String nationality2, String powRat2) throws ParseException {
		super();
		this.name = name2;
		SimpleDateFormat formatter1=new SimpleDateFormat("dd-mm-yyyy");
		Date date1=formatter1.parse(dateOfBirth2);
		this.dateOfBirth = date1;
		this.skill = skill2;
		this.numberOfMatches = Integer.parseInt(numberOfMatches2);
		this.runs = Integer.parseInt(runs2);
		this.wickets = Integer.parseInt(wickets2);
		this.nationality = nationality;
		this.powRat = Double.parseDouble(powRat2);
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getNumberOfMatches() {
		return numberOfMatches;
	}

	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public double getPowerRating() {
		return powRat;
	}

	public void setPowerRating(double powRat) {
		this.powRat = powRat;
	}
	
	public Player1 createPlayer(String detail) throws ParseException {
		
		String []arr = detail.split("\\,");
		Player1 pl1 = new Player1(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7]);
		System.out.println("Player Details: ");
		System.out.println("Name: "+pl1.name);
		System.out.println("Date-of-Birth: "+pl1.dateOfBirth);
		System.out.println("Skill: "+pl1.skill);
		System.out.println("Number of Matches: "+pl1.numberOfMatches);
		System.out.println("Runs: "+pl1.runs);
		System.out.println("Wickets: "+pl1.wickets);
		System.out.println("Nationality: "+pl1.nationality);
		System.out.println("Power rating: "+pl1.powRat);
		System.out.println();
		return pl1;
			
	}

	public String toString(String detail) throws ParseException {
		
		String []arr = detail.split("\\,");
			Player1 pl1 = new Player1();
			// TODO Auto-generated catch block
		System.out.println("Player Details: ");
		return "Player [name=" + arr[0] + ", dateOfBirth=" + arr[1] + ", skill=" + arr[2] + ", numberOfMatches="
				+ arr[3] + ", runs=" + arr[4] + ", wickets=" +arr[5] + ", nationality=" + arr[6]
				+ ", powRat=" + arr[7] + "]";

		}
}