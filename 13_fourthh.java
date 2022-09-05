import java.util.*;
public class fourthh  
{   
public static void main(String[] args)   
{   
	System.out.println("Enter the no. of elements of array");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] array=new int[n];
	System.out.println("Enter the elements of array");
	for(int i=0;i<n;i++)
	    array[i]=s.nextInt();
	Arrays.sort(array);   
System.out.println("Fourth largest number of array ");  
//prints  fourth largest element in an array using the for loop  
for(int i=0;i<array.length;i++)
	{
	if(i == array.length-4)
	System.out.println(array[i]);
}
}
}
