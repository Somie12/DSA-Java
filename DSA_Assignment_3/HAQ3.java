import java.util.*;
public class HAQ3 
{
    public static boolean isPalindrome(String str, int s, int e)
    {
        if(s>=e)
        {
            return true;
        }
        if(str.charAt(s)!= str.charAt(e))
        {
            return false;
        }
         else
         return isPalindrome(str, s+1, e-1);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("The given string " + str + " is Palindrom: " + isPalindrome(str, 0, str.length()-1));
        sc.close();
    }
}
