import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.text.Style;

public class ExcHand1 {
    public static void main(String[] args) throws Exception{

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the total run scored : ");
        int run = Integer.parseInt(br.readLine());
        System.out.println("enter the total overs faced : ");
        int ovr = Integer.parseInt(br.readLine());
        try{
            float rr = (run/ovr);
            System.out.println("Current run rate : " + rr);
            }
        catch(ArithmeticException e){
            System.out.println("ArithmaticException -- can't divide by zero");
        }

}
}
