import java.util.*;
public class diasum
{
	public static void main(String[] args){
		System.out.println("Enter the no of rows whereas row = column");
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int[][] mat=new int[n][n];
	    int dsum=0;
	    System.out.println("Enter "+ (2*n)+" no of elements"); 
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            mat[i][j]=s.nextInt();
	            if(i==j)
	               dsum+=mat[i][j];
	        }
	    }
	    
	    System.out.println("Sum of elements in diagonal " +dsum);
	 }
}

