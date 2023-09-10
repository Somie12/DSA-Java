import java.util.Scanner;
public class HAQ4 
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows of matrix: ");
    int r = sc.nextInt();
    System.out.println("Enter number of columns of matrix: ");
    int c = sc.nextInt();
    double a[][] = new double [r][c];
    double b[][] = new double [r][c];
    double sum[][] = new double [r][c];
    System.out.println("Enter elements of first matrix: ");
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            a[i][j] = sc.nextDouble();
        }
    }
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            b[i][j] = sc.nextDouble();
        }
    }
    sum= addMatrix(a, b);

    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            System.out.print(sum[i][j] + " ");
        }
        System.out.println();
    }
     sc.close();


}
public static double[][] addMatrix(double[][] a, double[][] b)
{
    int r= a.length;
    int c = a[0].length;
    double sum[][] = new double[r][c];
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
           sum[i][j] = a[i][j] + b[i][j];
        }
    }
    return sum;
}
}
