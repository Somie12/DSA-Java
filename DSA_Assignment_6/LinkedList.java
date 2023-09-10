import java.util.*;
class Node
{
    int info;
    Node next;
    Node(int info)
    {
        info = this.info;
        next = null;
    }
}
public class LinkedList
{
   public static Node push(Node top, int x)
   {
     Node new_node = new Node(x);
     if(top == null)
     {
        top = new_node;
        new_node.next = null;
       
     }
     else
     {
        new_node.next = top;
        top = new_node;
        
     }
     return top;
   }
   public static Node pop(Node top)
   {
     if(top == null)
     {
        System.out.println("Underflow");
     }
     else
     {
        top = top.next;
     }
     return top;
   }
   public static void display(Node top)
   {
     int c=1;
     Node temp = top;
     while(temp.next!=null)
     {
        c++;
        System.out.println(temp.info + " ");
     }
    }
   public static void main(String[] args) 
   {
   Scanner sc=new Scanner(System.in);
   Node top;
   top=null;
   while(true)
   {
     System.out.println("****MENU****");
     System.out.println("0:Exit");
     System.out.println("1:Push");
     System.out.println("2:Pop");
     System.out.println("3:Display");
     System.out.println("Enter your choice");
     int choice=sc.nextInt();
     switch(choice)
     {
      case 0:
      System.exit(0);
      break;
      case 1:
      {
        System.out.println("Enter an element to be inserted: ");
        int x = sc.nextInt();
        top=push(top,x);
        break;
      }
      
      case 3:
      display(top);
      break;

      default:
      System.out.println("Wrong choice");
     }
   }
   
  }
 }
