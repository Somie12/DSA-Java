import java.util.Scanner;
public class movingElement 
{
    public static void moveAllX(int index, String str, int count, String newstr)
    {
        int l = str.length();
        if(index == l-1)
        {
            for(int i=0;i<count;i++)
            {
                newstr += "x";
            }
            System.out.println(newstr);
        }
        if(str.charAt(index)== 'x')
        {
            count++;
            moveAllX(index+1, str, count, newstr);

        }
        else
        {
            newstr += str.charAt(index);
            moveAllX(index+1, str, count, newstr);

        }
        
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an string: ");
        String str = sc.nextLine();
        moveAllX(0, str, 0, "");
        sc.close();

    }
}
