import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.*;

public class PlayerMain {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Details of Player 1 : ");
		String player1 = br.readLine();
		System.out.println("Enter Player 2 Details");
		String player2 = br.readLine();
		String [] pla1 = player1.split("\\,");
		String [] pl2 = player2.split("\\,");
		String pstr1 = pla1[0];
		String pstr2 = pla1[1];
		String pstr3 = pla1[2];
		int pstr4 = Integer.parseInt(pla1[3]);
		int pstr5 = Integer.parseInt(pla1[4]);
		int pstr6 = Integer.parseInt(pla1[5]);
		String pstr7 = pla1[6];
		double pstr8 = Double.parseDouble(pla1[7]);
		
		
		String pstr11 = pl2[0];
		String pstr12 = pl2[1];
		String pstr13 = pl2[2];
		int pstr14 = Integer.parseInt(pl2[3]);
		int pstr15 = Integer.parseInt(pl2[4]);
		int pstr16 =  Integer.parseInt(pl2[5]);
		String pstr17 = pl2[6];
		double pstr18 = Double.parseDouble(pl2[7]);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
		LocalDate date = LocalDate.parse(pstr2, formatter);
		LocalDate date2 = LocalDate.parse(pstr12, formatter);
		Player1 pl1 = new Player1(pstr1, date, pstr3, pstr4, pstr5, pstr6, pstr7, pstr8);
		System.out.println("----------------- Player 1 --------------------\n" + pl1 + "\n");
		Player1 pl21 = new Player1(pstr11, date2, pstr13, pstr14, pstr15, pstr16, pstr17, pstr18);
		System.out.println("----------------- Player 2 --------------------\n" + pl21 + "\n");
		
		  Compare emp1 = new Compare(pstr1, pstr3, pstr7);
	      Compare emp2 = new Compare(pstr11, pstr13, pstr17);
	      boolean bool = emp1.equals(emp2);

	      if(bool)
	      {
	    	  System.out.println("Player 1 is same as player 2");
	      }
	      else
	      {
	    	  System.out.println("Player 1 and player 2 are different");
	      }
		
	}
}
