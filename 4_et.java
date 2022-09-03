import java.util.*;
public class et
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number to form equilateral triangle ");
		Scanner s=new Scanner(System.in);
        	int n=s.nextInt();
       		for(int i=0;i<n;i++)
                {
                	for(int j=i;j<=n;j++)
                	System.out.print(" ");
                	for(int k=0;k<=i;k++)
                	System.out.print("* ");
                	System.out.println();
       	        }
	}
}
