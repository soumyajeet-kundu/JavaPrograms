import java.util.*;
public class factorial {
    public static void main(String[] args) {
        int fact, num[], n, res=1, rem;
        System.out.println("Enter a number to check factorial : ");
        Scanner sc = new Scanner(System.in);
        fact = sc.nextInt();
        if(fact < 0){
            System.out.println("the number can't be negative");
        }
        else if(fact > 32767){
            System.out.println("the number can't be negative");
        }
        else{
            do{
                
            }
            rem = fact/10;
            n = fact % 10;
            for(int i=1; i<=n ;i++){    
                res=res*i;    
            }
            rem = rem/10;
            n = fact % 10;
            for(int i=1; i<=n ;i++){    
                res=res*i;    
            }
        }
        System.out.println(res+ " ");
    }
}
