import java.util.*;
import java.util.ArrayList;


public class GayleScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		int count2 = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> myList = new ArrayList<Integer>();
		System.out.println("enter the number of matches Gayle Played : ");
		int match = sc.nextInt();
		System.out.println("enter the runs he had scored inn those matches : ");
		for(int i=0 ; i < match ; i++){
			myList.add(sc.nextInt());
		}
		
		System.out.println("greaer than 50");
		for (int i : myList) {
			if(i>=50) {
				 count++;
			}
			if(i>=100) {
				 count2++;
			}
		}  System.out.println("greater than 50 : " +count);  
		 System.out.println("greater than 100 : " +count2);  
	}
}
