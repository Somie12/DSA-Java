import java.util.Scanner;
public class HAQ1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st integer: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd integer: ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd integer: ");
        int c = sc.nextInt();
        if( a+b == c && a == b-c && a* b == c)
        {
            System.out.println(a + " , " + b + " and " + c + " can be used in the given formulas.");
        }
        else
         {
            System.out.println(a + " , " + b + " and " + c + " can be used in the given formulas.");
         }
         sc.close();

    }
}
