import java.util.*;
public class Factorial
{
    public static int printFactorial(int n)
    {
        if(n==1 || n==0)
        {
             return 1;
        }
        int nm1 = printFactorial(n-1);
        int f = n*nm1;
        return f;

        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n= sc.nextInt();
        System.out.println(printFactorial(n));  
        sc.close();
    }
}
