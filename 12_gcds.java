import java.util.*;
public class gcds {
	public static void main (String[] args)
    {
		System.out.print("Enter two numbers");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int result = Math.min(a, b); 
        while (result > 0) {
            if (a % result == 0 && b % result == 0)
                break;
            result--;
        }
        System.out.println("GCD of " + a + " and " + b + " is " +result);
        int rem=0,sum=0,rem1=0,sum1=0,a1=a,b1=b;
	    while(a1>0 && b1>0)
	    {
	        rem=a1%10;
	        rem1=b1%10;
	        sum+=rem;
	        sum1+=rem1;
	        a1/=10;
	        b1/=10;
	    }
	    System.out.println("Sum of digits of "+ a +" is "+sum +"\n"+"Sum of digits of "+ b +" is "+sum1);
    }
}
