import java.util.*;
public class Q7 
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int ch;
       System.out.println("Choose a mathematical operation from below: ");
       System.out.println("Type 1 to determine the factorial of a number: ");
       System.out.println("Type 2 to determine x^n for two numbers x, n");
       System.out.println("Type 3 to determine gcd of two numbers ");
       System.out.println(" Type 4 to find binary equivalent of a decimal number ");
       System.out.println("Type 5 for product of two numbers");
       
       System.out.println("Enter choice: ");
       ch = sc.nextInt();
       switch(ch)
       {
         case 1: 
         {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            System.out.println("Factorial of " + n + " is " + fact(n));
         }
         case 2:
         {
            System.out.println("Enter base and power: ");
            int x = sc.nextInt();
            int n = sc.nextInt();
            System.out.println("x^n = " + power(x, n) );
         }
         case 3:
         {
            System.out.println("Enter first and second number: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
         }
         case 4:
         {
            System.out.println("Enter a decimal number: ");
            int n = sc.nextInt();
            System.out.println(n + " in binary is " + decimalToBinary(n));
         }
         case 5:
         {
            System.out.println("Enter first and second number: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x + " X " + y + " = " + (prod(x, y)));
         }
         default:
         {
            System.out.println("Wrong Choice! ");
         }
       }
       sc.close();
    }
     static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return (n * fact(n-1));
        
        
    }
    static int power(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        return (x * power(x, n-1));
    }
    static int gcd(int a, int b)
    {
        if(b==0)
        {
            return a;
        }
        else
        return gcd(b, a%b);
    }
    static int decimalToBinary(int n)
    {
        if (n == 0)
            return 0;
             
        else
         return (n%2 + 10* decimalToBinary(n/2));
    }
    static int prod(int x, int y)
    {
        if(y==0)
        {
            return 0;
        }
        else
        return (x + prod(x, y--));
    }

    
}
