import java.util.*;
public class findElement
{
    public static void findElementCount(int n, int a[], int x) {
        int count=0;
        for(int i = 0; i < n; i++)
        {
            if(a[i] == x){
                count++;
            }
        }
        System.out.println("Number of Occurrence of the Element: "+count);
    }
    public static void main(String[] args) 
    {
        int n, x, i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array: ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements: ");
        for(i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
            if(a[i]<0){
                System.out.println("invalid input");
                System.exit(0);
            }
        }
        System.out.print("Enter the element of which you want to count number of occurrences: ");
        x = sc.nextInt();
        if(x<0){
            System.out.println("invalid input");
            System.exit(0);
        }
        findElementCount(n, a, x);
    }
}