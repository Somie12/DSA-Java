import java.util.Scanner;
public class Q3 
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number: ");
         int n = sc.nextInt();
         int x = n;
         int sum = 0;
         int prod = 1;
         int d = 0;
         while(n>0)
         {
            d = n%10;
            n = n/10;
            sum += d;
            prod *= d;
         }
         if(sum == prod)
         {
            System.out.println("So, "+ x + " is a spy number.");
         }
         else{
            System.out.println("So, "+ x + " is  not a spy number.");
         }
         sc.close();
    }
}
