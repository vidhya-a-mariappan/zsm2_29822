import java.util.*;
public class diasum
{
	public static void main(String[] args){
		System.out.println("Enter the no of rows and columns");
	    Scanner s=new Scanner(System.in);
	    int row=s.nextInt();
	    int col=s.nextInt();
	    int[][] mat=new int[row][col];
	    int dsum=0;
	    System.out.println("Enter "+ (row+col)+" no of elements"); 
	    for(int i=0;i<row;i++)
	    {
	        for(int j=0;j<col;j++)
	        {
	            mat[i][j]=s.nextInt();
	            if(i==j)
	                dsum+=mat[i][j];
	        }
	    }
	    
	    System.out.println(dsum);
	 }
}

