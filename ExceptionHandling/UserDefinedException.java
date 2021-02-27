import java.util.*;
class AgeException extends Exception {
	AgeException(){
		System.out.println("CustomException--> InvalidAgeRangeException"); //user defined exception
	}
}

public class UserDefinedException {
	static void validate(String playerName, int playerAge)throws AgeException{
		
	     if(playerAge<19)
	     {
	    	 throw new AgeException();
	     }
	      
	     else
	      {
	    	 System.out.println("Player's name \n" + playerName);
			 System.out.println("Player's age \n" + playerAge);	
	      }
	   }
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter player's name \n");
		String playerName = sc.nextLine();
		System.out.println("Enter player's age \n");
		int playerAge = sc.nextInt();
		
		try
		{
			validate(playerName, playerAge);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
