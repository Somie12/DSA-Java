import java.util.Scanner;


public class HAQ3
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter size of array: ");
       int n = sc.nextInt();
       int a[] = new int[n];
       int b[] = new int[n];
       int c[] = new int[n];
       System.out.println("Enter elements of first array: ");
       for(int i=0;i<n;i++)
       {
           a[i] = sc.nextInt();
       }
       System.out.println("Enter elements of second array: ");
       for(int j=0;j<n;j++)
       {
           b[j] = sc.nextInt();
       }
       for(int k=0;k<n;k++)
       {
           c[k] = a[k] * b[k];
           System.out.println(c[k]);
       }
       sc.close();

}
}
