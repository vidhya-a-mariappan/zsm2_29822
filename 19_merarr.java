import java.util.*;
public class merarr
{
	public static void main(String[] args){
		System.out.println("Enter no.of elements in array1 and array2");
	    Scanner s=new Scanner(System.in);
	    int n1=s.nextInt();
	    int n2=s.nextInt();
	    int[] arr1=new int[n1];
	    int[] arr2=new int[n2];
	    int[] arr3=new int[n1+n2];
	    int j=0;
	    System.out.println("Enter "+ n1 + " elements of array1");
	    for(int i=0;i<n1;i++)
	    {
	        arr1[i]=s.nextInt();
	        arr3[j]=arr1[i];
	        j++;
	    }
	    System.out.println("Enter "+ n2 + " elements of array2");
	    for(int i=0;i<n2;i++)
	    {
	        arr2[i]=s.nextInt();
	        arr3[j]=arr2[i];
	        j++;
	    }
	    System.out.print("Merged Array { ");
	  	for(int i=0;i<arr3.length;i++)
	       System.out.print(arr3[i] + " ");
	  	System.out.print("}");
	 }
}
