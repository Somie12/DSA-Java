import java.util.Scanner;
public class Q6 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(n + " is odd: " + isOdd(n));
        sc.close();

    }
    public static boolean isOdd(int n)
    {
        int b= n&1;
        if(b==0)
        {
          return false;
        }
        else
        {
          return true;
        }
    }

}
