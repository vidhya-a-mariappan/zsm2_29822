import java.util.*;
public class oddevensum {
	public static void main(String[] args)   
	{   
		System.out.println("Enter the no. of elements of array");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] array=new int[n];
		int[] arraye=new int[n];
		int[] arrayo=new int[n];
		System.out.println("Enter the elements of array");
		int esum=0,osum=0,j=0,k=0;
		for(int i=0;i<n;i++)
		{
			array[i]=s.nextInt();
		    if(array[i]%2==0)
		    {
		     	esum+=array[i];
		    	arraye[j]=array[i];
		    	j++;
		    }
		     if(array[i]%2==1)
		     {
		       	osum+=array[i];
		       	arrayo[k]=array[i];
		       	k++;
		     }
		}
		System.out.print("Even Numbers in the array ");
		for(int i=0;i<j;i++)
			System.out.print(arraye[i]+ " ");
		System.out.println("\n");
		System.out.print("Odd Numbers in the array ");
		for(int i=0;i<k;i++)
			System.out.print(arrayo[i]+ " ");
		System.out.println("\n");
		System.out.println("Sum of even numbers of the array " + esum);
		System.out.println("Sum of odd numbers of the array " + osum);
		System.out.println("Sum of numbers of the array " + (esum+osum));
   }
}
