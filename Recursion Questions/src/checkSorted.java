import java.util.*;
public class checkSorted 
{
    public static boolean isSorted(int array[] , int index)
    {
        if( index == array.length-1)
        {
            return true;
        }
        
        if(array[index]< array[index+1])
        {
            return isSorted(array, index+1);
        }
        else
        {
            return false;
        }
        
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int l = sc.nextInt();
        int array[] = new int[l];
        System.out.println("Enter element of an array: ");
        for(int i = 0; i<l;i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println("Is given array sorted: " + isSorted(array,0));
        sc.close();
    }
}
