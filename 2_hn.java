import java.util.*;
public class hn
{
	public static void main(String args[])
	{
		//getting number form user to find whether it is happy number
		System.out.println("Enter the number ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=n,rem=0,res=0;
		while(temp>0)
		 	{
				rem=temp%10;
				res+=Math.pow(rem,2);
				temp/=10;
			if(temp<=0 && res>9)
           	 	{
                	temp=res;
                	res=0;
            		}
			}
		if (res==1)
			System.out.println(n + " is a happy number");
		else
			System.out.println(n + " is not a happy number");
	}
}
			
