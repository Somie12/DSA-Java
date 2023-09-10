
import java.util.*;
public class Q10 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       double m[][] = new double[3][4];
       System.out.println("Enter elements of matrix: ");
       for(int i=0;i<3;i++)
       {
        for(int j=0;j<4;j++)
        {
           m[i][j]= sc.nextDouble();
        }
       }
       for(int c=0;c<4;c++)
       {
        System.out.println(" Sum of the elements at column " + c +  " is " + sumColumn(m, c));
       }
       sc.close();

    }
    public static double sumColumn(double[][] m, int columnIndex)
    {
       double sum = 0;
       for(int r=0;r<3;r++)
        {
            sum += m[r][columnIndex];
        }
        return sum;
       
    }
}
