import java.util.*;
public class pn
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        Boolean r = false;
        for(int i = 0; i<= n; i++)
           if( (i * (i+1)) == n)
                r = true;
        if(r== true)
                System.out.println("It is a pronic number");
            else
                System.out.println("It is not a pronic number");
    }
}
