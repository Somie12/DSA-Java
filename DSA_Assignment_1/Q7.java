import java.util.Scanner;
public class Q7 
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter no of elements in array: ");
         int n = sc.nextInt();
         int a[] = new int [n];
         System.out.println("Enter elements of array: ");
         for(int i=0;i<n;i++)
         {
            a[i]= sc.nextInt();
         }
         int max = a[0];
         int min = a[0];
         int c1=0;
         int c2=0;
         int first = 0, last = 0;
         for( int j=0;j<n;j++)
         {
             if(a[j]<min)
             {
                min = a[j];
             }
             if(a[j]>max)
             {
                max = a[j];
             }
         }
         for(int k=0;k<n;k++)
         {
            if(a[k]==max)
            {
                c1++;
                if(c1 == 1)
                {
                    first = k;
                }
            }
            if(a[k]==min)
            {
                c2++;
                last = k;
            }
         }
         System.out.println("Maximum element of array is "+ max + " and occurs " + c1 + " times. ");
         System.out.println("Minimum element of array is "+ min + " and occurs " + c2 + " times. ");
         System.out.println("First occurance of maximum element is at position "+ first);
         System.out.println("Last occurance of minimum element is at postion "+ last);
         sc.close();

    }
}

