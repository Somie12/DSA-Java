import java.util.*;
public class Q1
{
  public static void main(String[] args)
  {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter you lucky number: ");
     int lno = sc.nextInt();
     try{
        if(lno<0)
        {
            throw new NumberFormatException("Negative Number");
        }
        System.out.println("Your lucky number is: " + lno);
     }
     catch (NumberFormatException e)
     {
        System.out.println(e);
     }
     sc.close();
  }
}
