import java.util.*;
public class Q1
{
class MarksOutOfBoundException extends Exception
{ 
        MarksOutOfBoundException(String s)
    {
        super("Marks can't be more than 100");
    }
}
class  student
{
    String name;
    int marks;
    public static void main(String[] args)
    {
    Scanner ob=new Scanner(System.in);
    System.out.println("Name of the Student:");
    name=ob.nextLine();
    System.out.println("enter marks:");
    try{
        if(marks>100)
        {
            throw new MarksOutOfBoundException("Marks can't be more than 100");
        }
        System.out.println(name+"has got"+marks+"marks");
    }
    catch(MarksOutOfBoundException e)
    {
        System.out.println(e);
        System.out.println("enter marks again:");
        int m=ob.nextInt();
        System.out.println(name+"has got"+marks+"marks");
    }
}     
}

}