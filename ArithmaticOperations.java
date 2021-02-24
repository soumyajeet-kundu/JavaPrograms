import java.util.Scanner;

public class ArithmaticOperations {

    public static void ArithmaticOperation(int n1, int n2, int ch)
    {
        int res;
        if((n1<0 && n2<0) || (ch>4 && ch<=0)){
            System.out.println("invalid input");
        }
        else{
        switch(ch){
            case 1:
                res = n1 + n2;
                System.out.println("sum is : " +res);
                break;
            case 2:
                res = n1 - n2;
                System.out.println("difference is : " +res);
                break;
            case 3:
                res = n1 * n2;
                System.out.println("product is : " +res);
                break;
            case 4:
                res = n1 / n2;
                System.out.println("division is : " +res);
                break;
            default:
                System.out.println("invalid");
            }
        }
    }
    public static void main(String[] args) {
        int n1, n2, ch;
        System.out.println("Enter first number ");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        System.out.println("Enter second number ");
        Scanner sc1 = new Scanner(System.in);
        n2 = sc1.nextInt();
        System.out.println("Enter the operator\nPress 1 for Sum\nPress 2 for Substraction\nPress 3 for Product\nPress 4 for Division ");
        Scanner sc2 = new Scanner(System.in);
        ch = sc2.nextInt();
        ArithmaticOperation(n1, n2, ch);
        // if(ch)
    }
}
