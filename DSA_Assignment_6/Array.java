import java.util.*;
public class Array
{
    public static final int Max = 10;
    static int s[];
    static int top;
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int s[] = new int[Max];
        top = -1;
        while(true)
        {
            System.out.println("***MENU***");
            System.out.println("0.Exit");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.println("4.Checks whether stack is empty");
            System.out.println("4.Checks whether stack is full");
            System.out.println("Enter your choice: ");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 0:
                {
                   System.exit(0);
                }
                case 1:
                {
                   System.out.println("Enter element to insert: ");
                   int x = sc.nextInt();
                   top = push(s,top, x);
                   System.out.println("Topmost element: " + top);
                   break;
                }
                case 2:
                {
                    top = pop(s,top);
                   System.out.println("Topmost element: " + pop(s,top));
                   break;
                }
                case 3:
                {
                    System.out.println("Elements of stack are: ");
                    display(s, top);
                    break;
                }
                case 4:
                {
                   System.out.println("Is stack empty: "+ isEmpty(top));
                   break;
                }
                case 5:
                {
                    System.out.println("Is stack full: " + isFull(top));
                    break;
                }
                default:
                {
                    System.out.println("Invalid Choice.");
                }
                
            }
        }
        
    }
    public static int push(int S[],int top, int x)
    {
       if(top == s.length-1)
       {
        System.out.println("Overflow.");
        
       }
       else
       {
        s[++top]=x;
       }
       return top;
    }
    public static int pop(int S[],int top)
    {
        if(top ==-1)
        {
            System.out.println("Underflow.");
            return -1;
        }
        else
        {
            top--;
            return s[top];
        }
        
    }
    public static int peek(int s[], int top)
    {
        return s[top];
    }
    public static void display(int S[],int top)
    {
        if(top == -1)
        {
            System.out.println("No elements in stack.");
        }
        else
        {
            for(int i=0;i<s.length;i++)
            {
               System.out.println(s[i]);
            }
            
        }
    }
    public static boolean isEmpty(int top)
    {
        if(top==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean isFull(int top)
    {
        if(top == Max)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


}