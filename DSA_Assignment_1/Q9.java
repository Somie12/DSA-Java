import java.util.Scanner;
public class Q9 
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter rows of matrix: ");
    int r = sc.nextInt();
    double m[][] = new double[r][r];
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<r;j++)
        {
              System.out.print(m[i][j] + " ");
            
        }
        System.out.println();
    }
    System.out.println("Sum of the elements in the major diagonal is "+ sumMajorDiagonal(m));
    sc.close();


}
public  static double sumMajorDiagonal(double[][] m)
{
    double sum = 0;
    for(int i=0;i<m.length;i++)
    {
        for(int j=0;j<m.length;j++)
        {
            if(i==j)
            {
                sum+=m[i][j];
            }
        }
    }
    return sum;
}
}

