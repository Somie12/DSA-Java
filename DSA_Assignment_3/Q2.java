import java.util.*;
public class Q2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] colors = new String[4];
        System.out.println("Enter four colors: ");
        for(int i=0;i<4;i++)
        {
            colors[i] = sc.nextLine();
        }
        try
        {
           Integer.parseInt(colors[0]);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        try
        {
           System.out.println("Enter one more color: ");
           colors[5] = sc.nextLine();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        
            
        
        System.out.println("The colors entered are: ");
        for(int i=0;i<4;i++)
        {
            System.out.println(colors[i]);
        }
        sc.close();


    }
}
