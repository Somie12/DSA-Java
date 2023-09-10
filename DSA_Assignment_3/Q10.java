import java.util.*;
public class Q10 
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string to be reversed: ");
    String s = sc.nextLine();
    System.out.println("Reversed string is: " );
    reverseString(s);
    sc.close();
    }
    public static void reverseString(String s)
    {
        if(s.length()<=1)
        {
            System.out.println(s);
        }
        else
        {
            System.out.print(s.charAt(s.length()-1));
            reverseString((s.substring(0 , s.length()-1)));;
        }
        

    }

}
