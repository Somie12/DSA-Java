import java.util.*;
class MarksOutOfBoundsException extends Exception
{
    MarksOutOfBoundsException(String message)
    {
        super(message);
    }
}
public class Q3 
{
     static String name;
    static double marks;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter marks: ");
        try
        {
           marks = sc.nextDouble();
           if(marks >100)
           {
             throw new MarksOutOfBoundsException("Marks can't be greater than 100");
           }
           System.out.println(name + " has got marks " + marks);
        }
        catch(MarksOutOfBoundsException e)
        {
            System.out.println(e);
        }
        sc.close();

    }
}
