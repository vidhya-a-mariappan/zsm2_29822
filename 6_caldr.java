import java.util.*;
import java.time.*;
import java.text.*;
public class caldr
{
	public static void main(String []args) throws Exception
	{
     		System.out.println("Enter the date in the format of dd/mm/yyyy");
		Scanner s=new Scanner(System.in);
		String d=s.nextLine();
		Date date = Calendar.getInstance().getTime();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String d1 = sdf.format(date);
		if(d1.compareTo(d)>0)
        	System.out.println("(A)Given date is not in future");
                else if(d1.compareTo(d)<0)
         	System.out.println("(A)Given date is in future");
       		else if(d1.compareTo(d)== 0)
         	System.out.println("(A)Given date is Today");
		System.out.print("(B)First Day and Last Day of the month are ");
		Calendar c=Calendar.getInstance();
		c.setTime(sdf.parse(d));
		c.set(Calendar.DAY_OF_MONTH, 1);
		Date f=c.getTime();
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		Date l=c.getTime();
		Format sdf1=new SimpleDateFormat("EEEE");
		String Firstday=sdf1.format(f);
		String Lastday=sdf1.format(l);
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		String f1= sd.format(f);
		String l1= sd.format(l);
		System.out.println(f1+" "+Firstday+" and "+l1+" "+Lastday);
		Calendar ca =Calendar.getInstance();
		ca.setTime(sdf.parse(d)); 
		ca.add(Calendar.DAY_OF_MONTH, 45);  
        	String da= sdf.format(ca.getTime());
		sdf = new SimpleDateFormat("EEEE");
      		String strDayofWeek = sdf.format(ca.getTime());
		System.out.println("(C)45 days after the given date "+d+" will be " + da +" "+ strDayofWeek);
			
       	    }
}
