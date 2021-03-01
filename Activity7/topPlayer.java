import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class topPlayer {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the top Players' name in IPL 13 : ");
		String name1 = br.readLine();
		String name2 = br.readLine();
		String name3 = br.readLine();
		String name4 = br.readLine();
		String name5 = br.readLine();
		
		ArrayList<String> al = new ArrayList<String>();
		al.add(name1);
		al.add(name2);
		al.add(name3);
		al.add(name4);
		al.add(name5);
		
		System.out.println("Enter the top Players' name in IPL 12 : ");
		String nam1 = br.readLine();
		String nam2 = br.readLine();
		String nam3 = br.readLine();
		String nam4 = br.readLine();
		String nam5 = br.readLine();
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add(nam1);
		al2.add(nam2);
		al2.add(nam3);
		al2.add(nam4);
		al2.add(nam5);
		
		
		al.retainAll(al2);
		System.out.println("top players are" +al);
		
	}
}
