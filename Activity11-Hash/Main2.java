import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
	
		
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String tf=null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, String[]> hv=new HashMap<String,String[]>();
		do {
		
		System.out.println("Enter the player name ");
		String b=br.readLine();
		System.out.println("Enter wicketsName - seperated by | symbol");
		String a=br.readLine();
		Bowler bo=new Bowler(b);
		Wicket w=new Wicket(a, bo);
		String c=w.getPlayerName();
		String[] cw=c.split("\\|");
		System.out.println("Do you want to add another player (yes/no)");
		tf=br.readLine();
		hv.put(b, cw);
		}
		while(tf.equalsIgnoreCase("yes"));
		
		System.out.println("enter the plyer name to search");
		String s=br.readLine();
		if ( hv.containsKey(s) ) {
			for (String url : hv.get(s))  
	            	System.out.println(url);
			}
		else {
			System.out.println("there is no player exist named: " +s);
			}
		}
		
	}

