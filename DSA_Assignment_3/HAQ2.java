import java.util.*;
public class HAQ2 
{
    public static int BSearch(int arr[], int l, int h, int key)
    {
        if(h>l && l<arr.length)
        {
            if(l==h)
            {
                if(arr[l]==key)
                {
                    return l;
                }
                else
                {
                    return -1;
                }
            }
            else
            {
                int mid = (l+h)/2;
                if(key == arr[mid])
                {
                    return mid;
                }
                else if(key>arr[mid])
                {
                    return BSearch(arr, mid+1, h, key);
                }
                else if(key < arr[mid])
                {
                    return BSearch(arr, l, mid-1, key);
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+ n + " elements in ascending order: ");
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }
        System.out.println("Enter an element to search: ");
        int key = sc.nextInt();
        int result = BSearch(arr, 0, arr.length-1, key);
        System.out.println((result ==-1?" Element not found." : " Element found at " + result ));
        sc.close();
    }
}
