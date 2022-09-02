import java.util.*;
public class as
{
    public static void main(String[] args)
    {
	System.out.println("Enter the to find whether it is armstrong or not");
	Scanner s=new Scanner(System.in);
        int n=s.nextInt();
	int rem,res=0;
        int temp=n;
        while (temp!= 0)
        {
            rem=temp%10;
            res+=Math.pow(rem, 3);
            temp/=10;
        }
        if(res==n)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong number");
    }
}
