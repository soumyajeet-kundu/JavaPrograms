import java.io.BufferedReader;
import java.io.InputStreamReader;
public class matchMain extends Match{
    public static void main(String[] args) throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the match format : ");
        System.out.println("1 - ODI: ");
        System.out.println("2 - T20I : ");
        System.out.println("3 - Test : ");
        int choice = Integer.parseInt(br.readLine());
        
        if(choice==1){
            System.out.println("enter the current score : ");
            int scr = Integer.parseInt(br.readLine());
            System.out.println("enter the current over : ");
            float ovr = Float.parseFloat(br.readLine());
            System.out.println("enter the target : ");
            int trg = Integer.parseInt(br.readLine());
            ODI mat1 = new ODI(scr, ovr, trg);
        }

        else if(choice==2){
            System.out.println("enter the current score : ");
            int scr = Integer.parseInt(br.readLine());
            System.out.println("enter the current over : ");
            float ovr = Float.parseFloat(br.readLine());
            System.out.println("enter the target : ");
            int trg = Integer.parseInt(br.readLine());
            T20I t20= new T20I(scr, ovr, trg);
        }

        else if(choice==3){
            System.out.println("enter the current score : ");
            int scr = Integer.parseInt(br.readLine());
            System.out.println("enter the current over : ");
            float ovr = Float.parseFloat(br.readLine());
            System.out.println("enter the target : ");
            int trg = Integer.parseInt(br.readLine());
            Test test= new Test(scr, ovr, trg);
        }
        else{
            System.out.println("invalid input");
        }
        
    }
}
