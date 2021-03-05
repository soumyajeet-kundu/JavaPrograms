import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PlayerMain11 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of players: ");
		n=sc.nextInt();
		Player11 [] pl = new Player11[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter details of player"+(i+1));
			String s;
			Scanner sc2=new Scanner(System.in);
			s=sc2.nextLine();
			pl[i]=Player11.createPlayer(s);
			}
		HashMap<String, Integer> hm = new HashMap<String, Integer>(); 
		String keys = ""; 
		int value = 0; 
		for (int i = 0; i < n; i++) { 
			if (hm.containsKey(pl[i].getNationality())) { 
				hm.put(pl[i].getNationality(), hm.get(pl[i].getNationality()) + 1); 
		    }  else { 
		    	hm.put(pl[i].getNationality(), 1); 
		    }
			Set<Map.Entry<String, Integer> > set = hm.entrySet(); 
			
			

			for (Map.Entry<String, Integer> me : set) { 
				if (me.getValue() > value) { 
					value = me.getValue(); 
         
					keys = me.getKey(); 
				} 
            } 
	System.out.println("The nationality of maximum players: "+ keys);
	System.exit(0);

        } 
    } 
}

