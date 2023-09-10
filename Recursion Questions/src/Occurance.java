import java.util.*;
public class Occurance 
{
    public static int first = -1;
    public static int last = -1;
    public static void findOccurance(String str, int index, char ele)
    {
        if(index == str.length())
        {
            System.out.println("Index of element " + ele + " first occurance is: " + first);
            System.out.println("Index of element " + ele + " last occurance is: " + last);
            return;

        }
        if(str.charAt(index) == ele)
        {
            if(first == -1)
            {
                first = index;
            }
            else
              last = index;
        }
        findOccurance(str, index+1, ele);

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Enter an element whose occrance is to be printed: ");
        char ele = sc.next().charAt(0);
        findOccurance(str, 0, ele);
        sc.close();
    }
}
