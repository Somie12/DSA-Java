public class HAQ5 
{
    public static void main(String[] args)
    {
        int a[][] = new int [4][4];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                a[i][j] = (int)(0 + (1-0)*Math.random());
            }
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The largest row index: " + largestRow(a ));
        System.out.println("The largest column index: " + largestColumn(a ));



    }
    public static int largestRow(int a[][])
    {
        int maxrow = 0;
        int temp = 0;
        for(int i=0;i<4;i++)
        {
             int count = 0;
            for(int j=0;j<4;j++)
            {
                if(a[i][j] == 1)
                {
                    count++;
                }
            }
            if(count > temp)
            {
                temp = count;
                maxrow = i;
            }
        }
        return maxrow;
    }
    public static int largestColumn(int a[][])
    {
        int maxcol = 0;
        int temp = 0;
        for(int i=0;i<4;i++)
        {
            int count = 0;
            for(int j=0;j<4;j++)
            {
                if(a[j][i] == 1)
                {
                    count++;
                }
            }
            if(count > temp)
            {
                temp = count;
                maxcol = i;
            }
        }
        return maxcol;
    }
}
