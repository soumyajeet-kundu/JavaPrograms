import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

    public class Player11 {
    private String name;
    private Date dateOfBirth;
    private String skill;
    private int numberOfMatches;
    private int runs;
    private int wickets;
    private String nationality;
    private double powerRating; 

    public Player11(String name, Date dateOfBirth, String skill, int numberOfMatches, int runs, int wickets,
		String nationality, double powerRating) {
	super();
	this.name = name;
	this.dateOfBirth = dateOfBirth;
	this.skill = skill;
	this.numberOfMatches = numberOfMatches;
	this.runs = runs;
	this.wickets = wickets;
	this.nationality = nationality;
	this.powerRating = powerRating;
}
    public Player11(String name2, String string, String skill2, String string2, String string3, String string4,
		String nationality2, String string5) throws ParseException {
	// TODO Auto-generated constructor stub
	this.name = name2;
	  SimpleDateFormat formatter1= new SimpleDateFormat("dd-MM-yyyy");  
	  Date date1 = formatter1.parse(string);
	  this.dateOfBirth= date1;
	  this.skill = skill2;
	  this.numberOfMatches = Integer.parseInt(string2);
	  this.runs =  Integer.parseInt(string3);
	  this.wickets = Integer.parseInt(string4);
	  this.nationality = nationality2;
	  this.powerRating =Double.parseDouble(string5);
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
        return powerRating;
    }
    public void setPowerRating(double powerRating) {
        this.powerRating = powerRating;
    }
    public static Player11 createPlayer(String detail) throws ParseException {
        String[] str1 = detail.split(",");
        Player11 P = new Player11(str1[0],str1[1],str1[2],str1[3],str1[4],str1[5],str1[6],str1[7]);
        return P;
        
    }
}
