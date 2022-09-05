import java.util.*;
public class bmic
{
	public static void main(String[] args){
		System.out.println("Enter the weight in kg and height in m");
	    Scanner s=new Scanner(System.in);
	    double w=s.nextDouble();
	    double h=s.nextDouble();
	    double bmi=w/(h*h);
	    System.out.println("BMI = " + bmi + " kg/m^2" );
	}
}
