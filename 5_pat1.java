import java.util.*;
public class pat1
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number to form pattern");
		Scanner s=new Scanner(System.in);
       		int n=s.nextInt();
        	int temp=2*n,left=1,right=1;
        	for(int i=0;i<n;i++)
        	{
            	left=1;
            	right=i+1;
            	temp-=2;
           	for(int j=0;j<=i;j++)
           	System.out.print(left++);
              	for(int k=0;k<temp;k++)
                System.out.print(" ");
                for(int l=0;l<=i;l++)
                System.out.print(right--);
                System.out.println();
                }
	}
}
