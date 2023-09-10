import java.util.*;
public class Q4 
{
   public static void main(String[] args) 
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter array elements of int datatype: ");
     Integer[] intarr = new Integer[5];
     for(int i=0;i<5;i++)
     {
        intarr[i] = sc.nextInt();
     }
    System.out.println("Integer array contains: ");
    printArray(intarr);
    Double[] dbarr = new Double[5];
     for(int i=0;i<5;i++)
     {
        dbarr[i] = sc.nextDouble();
     }
    System.out.println("Double array contains: ");
    printArray(dbarr);
    sc.close();


   }
   public static < E > void printArray( E[] inputArray)
   {
     for(int i=0;i<inputArray.length;i++)
     {
        System.out.print(inputArray[i] + " ");
     }
     System.out.println();
   }
}
