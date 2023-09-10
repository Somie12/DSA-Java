import java.util.Scanner;
public class Q5 
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    int x=n;
    System.out.println("Sum of digits of "+ x + " until the number is a single digit is "+ sum_Of_Digits(n));
    sc.close();
}
public static int sum_Of_Digits(int n)
{
    int d=0, sum = 0;
    while(n>0)
    {
        d = n%10;
        sum +=d;
        n = n/10;
    }
    if(sum>=10)
    {
        return sum_Of_Digits(sum);
    }
    else
    {
    return sum;
    }
}

}
