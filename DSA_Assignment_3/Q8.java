import java.util.*;
public class Q8 
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number to be reversed: ");
       int n = sc.nextInt();
       System.out.println("Reverse of given number is: ");
       reverseNumber(n);
       sc.close();
    }
    public static void reverseNumber(int n)
    {
        if(n<0)
        {
            System.out.print(n);
            
        }
        else
        {
            System.out.print(n%10);
            reverseNumber(n/10);
        }
    }
}
