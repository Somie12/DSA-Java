import java.util.*;
public class Print
{
    public static void printNumber(int n)
    {
        if(n==0)
        return;

        System.out.println(n);
        printNumber(n-1);
    }
    public static void printNumber2(int n)
    {
        if(n==11)
        return;

        System.out.println(n);
        printNumber(n+1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        printNumber(n);
        printNumber2(n);
        sc.close();

    }
}