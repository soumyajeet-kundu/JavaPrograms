import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ListCricketer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Players' name : ");
		String name = br.readLine();
		
		System.out.println("Enter the Players' age : ");
		int age = Integer.parseInt(br.readLine());
		
		System.out.println("Enter the Players' country : ");
		String cntry = br.readLine();
		
		System.out.println("Enter the Players' skill : ");
		String skill = br.readLine();
		
		System.out.println("Enter the Players' position : ");
		int pos = Integer.parseInt(br.readLine());
		
		ArrayList al = new ArrayList();
		al.add(name);
		al.add(age);
		al.add(cntry);
		al.add(skill);
		al.add(pos);
		al.remove(4);
		
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			Object str =  itr.next();
			System.out.println(str);
		}
	}
}
