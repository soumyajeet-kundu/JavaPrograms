import java.util.*;
public class factorial
{
static	void digitFactorial(int n){
	    int a[]=new int[5];
	    if(n>32767){
	        System.out.println("input number is too large");
	  
	    }
	    else if(n<0){
	        System.out.println("input number can't be negative");
	    }
	    else{
	     int t=n;
	     int rev=0;
	    
	        while(t != 0) {
            int digit = t% 10;
            rev= rev * 10 + digit;
            t /= 10;
            }

         while(rev!=0){
             int k=rev%10;
             int p=0;
             for(int i=k-1;i>0;i--){
                k=k*i;
            }
             a[p]=k;
              System.out.println(a[p]);
              p++;
             rev=rev/10;
            }
	    }
	}
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		digitFactorial(n);	
	}
}
