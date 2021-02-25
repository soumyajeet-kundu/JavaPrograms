import java.util.*;
public class inningsMain {
    static int c;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        innings i = new innings();
        System.out.print("Team :");
        String name = sc.nextLine();
        
        System.out.print("Innings :");
        String inn = sc.nextLine();
        
        System.out.print("Runs :");
        String run = sc.nextLine();

        i.setName(name);
        i.setInnings(inn);
        i.setRuns(run);

        System.out.println("Team : " + i.getName());
        System.out.println("Innings : " + i.getInnings());
        System.out.println("Runs : " + i.getRuns());
        c=Integer.parseInt(run);
        if(inn.equals("second"))
        {
            System.out.println("scored "+ c +" runs, Match ended");
        }
        if(inn.equals("first"))
        {
            System.out.println("need "+ (c+1) +" runs to win");
        }
        
    }
}
