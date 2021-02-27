import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HotelMain {
    public static void main(String[] args) throws Exception{
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Select Room Type");
        System.out.println("1. Deluxe Room");
        System.out.println("2. Deluxe AC Room");
        System.out.println("3. Suite AC Room");
        int no = Integer.parseInt(br.readLine());
        if(no==1){
            System.out.println("Hotel Name : ");
            String hName  = br.readLine();
            System.out.println("Room Squareft Area : ");
            int area  = Integer.parseInt(br.readLine());
            System.out.println("Room Has TV (yes/no): ");
            String ch1 = br.readLine();
            boolean b = true;
            if(ch1.equalsIgnoreCase("yes")){
                b= true;
            }
            else
                b = false;
            System.out.println("Room Has Wifi (yes/no): ");
            String ch2 = br.readLine();
            boolean b2 = true;
            if(ch1.equalsIgnoreCase("yes")){
                b2 = true;
            }
            else{
                b2 = false;
            }
            deluxeRoom dr = new deluxeRoom(hName, area, b, b2);
            dr.rateCalculatorDR();
        }

        else if(no==2){
            System.out.println("Hotel Name : ");
            String hName  = br.readLine();
            System.out.println("Room Squareft Area : ");
            int area  = Integer.parseInt(br.readLine());
            System.out.println("Room Has TV (yes/no): ");
            String ch1 = br.readLine();
            boolean b = true;
            if(ch1.equalsIgnoreCase("yes")){
                b= true;
            }
            else
                b = false;
            System.out.println("Room Has Wifi (yes/no): ");
            String ch2 = br.readLine();
            boolean b2 = true;
            if(ch1.equalsIgnoreCase("yes")){
                b2 = true;
            }
            else{
                b2 = false;
            }
            DeluxeAc dac = new DeluxeAc(hName, area, b, b2);
            dac.rateCalculatorDR();
        }

        else if(no==3){
            System.out.println("Hotel Name : ");
            String hName  = br.readLine();
            System.out.println("Room Squareft Area : ");
            int area  = Integer.parseInt(br.readLine());
            System.out.println("Room Has TV (yes/no): ");
            String ch1 = br.readLine();
            boolean b = true;
            if(ch1.equalsIgnoreCase("yes")){
                b = true;
            }
            else
                b = false;
            System.out.println("Room Has Wifi (yes/no): ");
            String ch2 = br.readLine();
            boolean b2 = true;
            if(ch1.equalsIgnoreCase("yes")){
                b2 = true;
            }
            else{
                b2 = false;
            }
            suiteAc sac = new suiteAc(hName, area, b, b2);
            sac.rateCalculatorDR();
        }
        else{
            System.out.println("invalid input");
        }
    }
}
