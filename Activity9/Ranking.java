import java.util.Comparator;

public class Ranking {
	private int score;
    private String name;
 
    // Constructor
    public Ranking(int score, String name)
    {
        this.score = score;
        this.name = name;

    }
 
    // Used to print student details in main()
    public String toString()
    {
        return this.score + " " + this.name;
    }

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
 
class SortByScore implements Comparator<Ranking>
{
 
    public int compare(Ranking a, Ranking b)
    {
        return b.getScore() - a.getScore();
    }
}
