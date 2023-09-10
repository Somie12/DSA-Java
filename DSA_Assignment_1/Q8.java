import java.util.Scanner;
public class Q8 
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter  number of Row and Columns of 2D-Array: ");
    int r = sc.nextInt();
    int c = sc.nextInt();
    int a[][] = new int[r][c];
    int sum = 0;
    System.out.println("Enter elements of 2-D array: ");
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
           a[i][j]= sc.nextInt();
           sum+= a[i][j];
        }
    }
    System.out.println("The sum of elements of the 2D-Array is: "+ sum);
    sc.close();


}
}
