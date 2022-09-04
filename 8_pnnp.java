import java.util.*;
public class pnnp
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int i=0,count=0;
		if(i==0)
		    System.out.print(i+" ");
		while(i<n)
		{
		while(count<n-1)
		{
		    for(int j=1;j<=i/2;j++)
		    {
		        if(i%j==0 && (j*(j+1))==i)
				{
		            System.out.print(i+" ");
				count++;
				break;
				}
		     }
		 i++;
		}
		}
		System.out.print("\n");
		int ct=0,k=0,m=1,j=1;  
		while(k<n)  
		{  
		j=1;  
		ct=0;  
		while(j<=m)  
		{  
			if(m%j==0)  
				ct++;  
			j++;   
		}  
		if(ct==2)  
		{  
		System.out.print(m + " ");  
		k++;  
		}  
		m++;  
                }  
     }  
}  
