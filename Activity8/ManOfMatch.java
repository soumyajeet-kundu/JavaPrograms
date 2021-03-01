import java.util.*;
public class ManOfMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of matches : ");
		int match = sc.nextInt();
		HashSet<String> hs = new HashSet<String>();
		System.out.println("enter the names of MOM : ");
		for(int i=0 ; i <= match ; i++){
			hs.add(sc.nextLine());
		}
		System.out.println(hs.size());
		System.out.println("MOM are --");
		for(String s : hs) {
			System.out.println(s);
		}
	}

}
