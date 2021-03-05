import java.time.LocalDate;
import java.util.Date;
import java.util.*;

public class Player1 {
	private String name;
	private LocalDate dob;
	private String skill;
	private int noOfMatch;
	private int runs;
	private int wickets;
	private String nationality;
	private double powRat;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public LocalDate getDateOfBirth() {
		return dob;
	}
	public void setDateOfBirth(LocalDate dob) {
		this.dob = dob;
	}
	public int getNoOfMatch() {
		return noOfMatch;
	}
	public void setNoOfMatch(int noOfMatch) {
		this.noOfMatch = noOfMatch;
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
	public Player1(String name, LocalDate dob, String skill, int noOfMatch, int runs, int wickets, String nationality,
			double powRat) {
		super();
		this.name = name;
		this.skill = skill;
		this.dob = dob;
		this.noOfMatch = noOfMatch;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		this.powRat = powRat;
	}
	@Override
	public String toString() {
	return "Name: " + name +"\n" + "Skill: " + skill +"\n"+ "DOB: " +"\n"+ dob+"\n" + "Number of Matches: " + noOfMatch+"\n"+ "Runs: " + runs+"\n" +"Wickets: " + wickets+"\n" + "Nationality: " + nationality+"\n" + "powRat: "+ powRat + "]";
	}
	
	
	
}
