import java.util.Scanner;
public class leapYear {
   public static void main(String[] args){
      int yr;
      System.out.println("Enter an Year to check whether it is leap-year or not : ");
      Scanner sc = new Scanner(System.in);
      yr = sc.nextInt();
      if(yr<0){
        System.out.println("invalid input");
      }
      else if (((yr % 4 == 0) && (yr % 100!= 0)) || (yr %400 == 0)){
          System.out.println("This is a leap-year");
        }
      else
         System.out.println("this is not a leap-year");
   }
}