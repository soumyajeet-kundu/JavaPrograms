import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class PlayerOfMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of matches : ");
		int match = sc.nextInt();
		TreeSet<String> ts = new TreeSet<String>();
		System.out.println("enter the names of MOM : ");
		for(int i=0 ; i <= match ; i++){
			ts.add(sc.nextLine());
		}
		System.out.println("\nMOM are --");
		for(String s : ts) {
			System.out.println(s);
		}
	}
}
