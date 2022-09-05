import java.util.*;
public class mirrorarray
{
	public static void main(String[] args) {
		System.out.println("Enter the no. of elements of array");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] num=new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++)
		{
		    num[i]=s.nextInt();
		}
		int f=0,l=n-1;
		boolean mirror=true;
		while(f<=l)
		{
		    if(num[f]!=num[l])
		    {
		        mirror=false;
		        break;
		    }
		    else
		    {
		        f++;
		        l--;
		    }
		 }
		 
		 if(mirror)
		    System.out.println("Given array"+ Arrays.toString(num) +" is a mirror inverse");
		 else
		     System.out.println("Given array"+Arrays.toString(num) +" is not a mirror inverse");
	}	
}
