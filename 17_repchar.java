import java.util.*;
public class repchar
{
	public static void main(String[] args){
		System.out.println("Enter the String (case sensitive)");
	    Scanner s=new Scanner(System.in);
	    String str=s.nextLine();
	    System.out.println("Enter the character to be changed __ by the character __");
	    char c_ch=s.next().charAt(0);
	    char c_upd=s.next().charAt(0);
	    String strupd=str.replace(c_ch,c_upd);
	    System.out.println(strupd);
	}
}
