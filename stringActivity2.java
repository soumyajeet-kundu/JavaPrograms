import java.util.*;
public class stringActivity2 {
    public static void main(String[] args) {
        String f, s; 
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the name : ");
        f = sc.nextLine();
        s = sc.nextLine();
        String firstLetter = f.substring(0,1);
        firstLetter = firstLetter.toUpperCase();
        
        String remainingLetter = f.substring(1, f.length());
        remainingLetter = remainingLetter.toLowerCase();
        
        String lastName = s.substring(0);
        lastName = lastName.toUpperCase();
        System.out.print(firstLetter+remainingLetter + " "+lastName);
        }
}
