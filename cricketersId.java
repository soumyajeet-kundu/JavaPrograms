import java.util.*;
import java.util.Scanner;
public class cricketersId
{
    static   int b[] = new int[20];
    public static void findId(int n, int a[], int x) {
      
        for(int i = 1; i <=n; i=i+2)
        {
            if(a[i] > x){
                b[i-1] = a[i-1];
            }
        }
        System.out.println("the cricketers selected are : ");
        for(int j=0; j<n; j=j+2){
            if(b[j]==0)
            continue;
            else
            System.out.println(b[j]);
        }
    }
    public static void main(String[] args) 
    {
        int n1, score, i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array: ");
        n1 = sc.nextInt();
        int a[] = new int[n1];
        System.out.println("Enter id and score alternatively :");
        for(i = 0; i < n1; i++)
        {
            a[i] = sc.nextInt();
            if(a[i]<0){
                System.out.println("invalid input");
                System.exit(0);
            }
        }
        System.out.print("Enter the minimum score: ");
        score = sc.nextInt();
        if(score<0){
            System.out.println("invalid input");
            System.exit(0);
        }
        findId(n1, a, score);
    }
}