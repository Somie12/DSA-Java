import java.util.*;
public class Q9 
{
   public static void main(String[] args) 
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter one number: ");
     int n = sc.nextInt();
     System.out.println("Fibonacci number at position " + n + " is " + fibbonacci(n));
     sc.close();

   }
   public static int fibbonacci(int n)
   {
    if(n<=1)
    {
        return n;
    }
    else
    {
        return(fibbonacci(n-1) + fibbonacci(n-2));
    }
   }
}
