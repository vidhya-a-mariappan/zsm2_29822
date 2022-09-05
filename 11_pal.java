import java.util.*;
public class pal
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to check whether it is palindrome or not");
		int n=s.nextInt();
		int temp=n,rev=0,rem=0;
		boolean r=true,r1=false;
		while(temp>0)
		{
		    rem=temp%10;
		    rev=(rev*10)+rem;
		    temp=temp/10;
		}
		 if(rev==n)
		   System.out.println("TRUE " + "\n" + n + " is a Palindrome Number");
		   else
		     System.out.println("FALSE " + "\n" + n + " is not a Palindrome Number");
		    
                 
	}
}
