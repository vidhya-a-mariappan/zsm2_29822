import java.io.*;
import java.util.Scanner;
public class cyclic {
    // Function to generate all cyclic permutations of a number
    static boolean isCyclic(long N)
    {
        // Count digits and check if all digits are same
    	//If all digits are same, then not considered cyclic.
        long num = N;
        int count = 0;
        int digit = (int)(num % 10);
        boolean allSame = true;
        while (num > 0) {
            count++;
            if (num % 10 != digit)
                allSame = false;
            num = num / 10;
        }
        if (allSame == true)
            return false;
   // If counts of digits is even and two halves are same, then the number is not cyclic
        if (count % 2 == 0) {
            long halfPower = (long)Math.pow(10, count / 2);
            long firstHalf = N % halfPower;
            long secondHalf = N / halfPower;
            if (firstHalf == secondHalf && isCyclic(firstHalf))
                return false;
        }
        num = N;
        while (true) {
            long rem = num % 10;
            long div = num / 10;
            num = (long)(Math.pow(10, count - 1))* rem+ div;
             if (num == N)
                break;
             if (num % N != 0)
                return false;
        }
         return true;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner s =new Scanner (System.in);
        Long N =s.nextLong();
        if (isCyclic(N))
            System.out.print(N+" is a cyclic number");
        else
            System.out.print(N+" is not a cyclic number");
    }
}
 

	
