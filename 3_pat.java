import java.util.*;
public class pat
{
	public static void main(String[] args) {
	System.out.println("Enter the number to form pattern");
	Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=n,i;
        for(i=0;i<=n/2;i++)
        {
            for(int j=0;j<=(2*i);j++)
            System.out.print("*");
            System.out.println();
        }
        for(int k=i;k<n;k++)
        {
            temp-=2;
            for(int l=0;l<temp;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
