
import java.text.ParseException;
import java.util.Scanner;
import java.util.*;

public class PlayerMain {

	public static void main(String[] args) throws ParseException {
		
		Player1 p1=new Player1();
		Team t1=new Team();
	 
		Scanner s=new Scanner(System.in);
	 	System.out.println("Enter the name of the Team:");
		String str=s.next();
		System.out.println("1.Add Player");
		System.out.println("2. Delete Players");
		System.out.println("3. Display Players");
		System.out.println("4. Exit");
		int n=s.nextInt();
		boolean c ;
		if(n!=4)
		{
			c = true;
		}
		while(c=true)
		{
			for (int i=0;i<10;i++)
			{
				if(n==1)
				{
					System.out.println("Enter player details in CSV format");	
					p1.createPlayer(s.next());
		
					t1.addPlayerToTeam(p1);
					System.exit(0);
				}
				else if(n==2)
				{
					System.out.println("Enter player name");	
					t1.removePlayerFromTeam(s.next());
					System.exit(0);
				}
				else if(n==3)
				{
					t1.displayPlayers();
					System.exit(0);
				}
			}
		}
		if(n==4)
		{
			System.out.println("Exit");
			System.exit(0);
			return;
		}
		
	}

}
