import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.text.Style;

public class ExcHand1 {
    public static void main(String[] args) throws Exception{

        try{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the total run scored : ");
        int run = Integer.parseInt(br.readLine());
        System.out.println("enter the total overs faced : ");
        int ovr = Integer.parseInt(br.readLine());
    
        float rr = (run/ovr);
        System.out.println("Current run rate : " + rr);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmaticException -- can't divide by zero");
        }
        catch(NumberFormatException e1){
            System.out.println("NumberFormatException -- you should enter a number");
            System.exit(0);
        }

}
}
