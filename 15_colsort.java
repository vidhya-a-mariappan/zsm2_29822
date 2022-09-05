import java.util.*;
public class colsort {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows and columns");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		System.out.println("Enter column to be sort");
		int c=sc.nextInt();
		int temp=0;
		System.out.println("Enter the elements of array");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			   arr[i][j]=sc.nextInt();
		}
		int k=c-1;
		for(int r=1;r<row;r++)
		{
			int j=r-1;
			temp=arr[r][k];
			while(j>=0 && arr[j][k]>temp && k<col)
			{
				arr[j+1][k]=arr[j][k];
				j--;
			}
			arr[j+1][k]=temp;
		}
		
		for(int i=0;i<row;i++)
		System.out.println(arr[i][k]);
	}
}
