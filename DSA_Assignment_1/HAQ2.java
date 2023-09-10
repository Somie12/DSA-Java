import java.util.Scanner;
public class HAQ2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines: ");
        int n = sc.nextInt();
        String[] s = new String[n];
        System.out.println("Enter lines: ");
        for(int i=0;i<n;i++)
        {
            s[i] = sc.nextLine();
        }
        for(int j=n;j>0;j--)
        {
            System.out.println(s[j]);
        }
        sc.close();
    }
}
