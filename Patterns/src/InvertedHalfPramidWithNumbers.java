public class InvertedHalfPramidWithNumbers 
{
    public static void main(String[] args)
    {
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        /*for(int i=1;i<=4;i++)
         * {
         *    for(int j=1;j<=4-i+1;j++)               //runs code in minimum time among all codes
         *    {
         *       System.out.print(j);
         *    }
         *    Syste.out.println();
         * }
         */
    }
}
