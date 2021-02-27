import java.util.*;
public class ArrayOutofBound {
	public static void main(String[] args) {
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number of overs required \n");
			int overs = sc.nextInt();
			System.out.println("Enter runs per over \n");
			int [] arr = new int[overs];
			for (int i = 0; i < overs; i++) {
				System.out.println("Enter run " + i);
				arr[i] = sc.nextInt();
			}
			System.out.println("Enter the over number you require : ");
			int overNumber = sc.nextInt();
			System.out.println("Runs Scored in this over " + arr[overNumber-1]);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception " + e);
		}
	}

}
