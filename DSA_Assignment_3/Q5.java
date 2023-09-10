import java.util.*;
public class Q5 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = new Integer[5];
        System.out.println("Enter array elements: ");
        for(int i=0;i<5;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to search: ");
        int ele = sc.nextInt();
        int c = count(arr, ele);
        System.out.println( "Number of times " + ele + " present in the array is "  + c);
        sc.close();
    }
    public static <T> int count(T[] array, T item)
    {
        int count =0;
        for(int i=0;i<array.length;i++)
        {
            if(item.equals(array[i]))
            {
                count++;
            }
        }
        return count;
    }

}