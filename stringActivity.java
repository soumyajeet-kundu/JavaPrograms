import java.util.*;

public class stringActivity {
    public static void main(String[] args) {
        String firstName, lastName;
        System.out.print("enter the name : ");
        Scanner sc = new Scanner(System.in);
        firstName = sc.nextLine();
        System.out.print("enter another name : ");
        lastName = sc.nextLine();
        String check = firstName.substring(firstName.indexOf(' '));
        String check1 = lastName.substring(lastName.indexOf(' '));
        if(check.equals(check1)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
