public class Q4 
{
    public static void main(String[] args)
    {
        
        char a[] = {'c','a', 'r', 'b','o','n'};
        int l = a.length;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                for(int k=0;k<l;k++)
                {
                    for(int m=0;m<l;m++)
                    {
                        for(int n =0;n<l;n++)
                        {
                           for(int o=0;o<l;o++)
                           {
                              if(a[i]!=a[j] && a[i]!=a[k] && a[i]!=a[m] && a[i]!=a[n] && a[i]!=a[o] && a[j]!=a[k] && a[j]!=a[m] && a[j]!=a[n] && a[j]!=a[o] && a[k]!=a[m] && a[k]!=a[n] && a[k]!=a[o] && a[m]!=a[n] && a[m]!=a[o] && a[n]!=a[o])
                              {
                                System.out.println(a[i] + a[j] +a[k] + a[m] + a[n] + a[o]);
                              }
                           }
                        }
                    }
                }
            }
        }
    }
}
