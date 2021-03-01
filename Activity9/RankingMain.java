import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class RankingMain {
	 public static void main (String[] args) throws NumberFormatException, IOException 
	    {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	Scanner sc = new Scanner(System.in);
	        ArrayList<Ranking> ar = new ArrayList<Ranking>();
	        System.out.println("Enter the number of records");
	        int numberOfRecords = Integer.parseInt(br.readLine());
	    	for(int i=0;i<numberOfRecords; i++)
			{
	    		System.out.println("Enter Score of player" +(i+1));
				int j = Integer.parseInt(br.readLine());
				System.out.println("Enter Name of player" +(i+1));
				String k = br.readLine();
				ar.add(new Ranking(j,k));	
			}

	    	System.out.println("Unsorted");
	        for (int i=0; i<ar.size(); i++)
	            System.out.println(ar.get(i));
	 
	        Collections.sort(ar, new SortByScore());
	 
	        System.out.println("\nSorted by score");
	        for (int i=0; i<ar.size(); i++)
	            System.out.println(ar.get(i));
	 
	    }
}
