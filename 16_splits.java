import java.util.*;
public class splits
{
	public static void main(String[] args) {
		System.out.println("Enter the sentence to split");
		Scanner s=new Scanner(System.in);
	    String str=s.nextLine();
		String[] sstr=str.split(" ");
	    for(String part: sstr)
	      System.out.println(part);
	 }
}
