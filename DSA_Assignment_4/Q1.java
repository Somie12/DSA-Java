import java.util.*;
class Node
{
  protected int regd_no;
  protected float mark;
  protected Node next;
  Node(int regd_no, float mark)
  {
    this.regd_no = regd_no;
    this.mark = mark;
    this.next = null;
  }
  public float getmark()
  {
    return mark;
  }
  public int getregd_no()
  {
    return regd_no;
  }


}
public class Q1
{
     static Scanner sc = new Scanner(System.in);
    public static Node create(Node start)
    {
        System.out.println("Enter Reg No: ");
        int regd_no = sc.nextInt();
        System.out.println("Enter marks: ");
        float mark = sc.nextFloat();
        start = new Node(regd_no, mark);
        System.out.println("Linked List Created....");
        return start;

    }
    public static Node InsBeg(Node start)
    {
        if(start == null)
        {
            start = create(start);
            return start;
        }
        else
        {
          System.out.println("Enter reg no: ");
          int r = sc.nextInt();
          System.out.println("Enter your marks: ");
          float m = sc.nextFloat();
          Node new_node = new Node(r,m);
          new_node.next= start;
          start = new_node;
          System.out.println("Node inserted at the beginning.....");
          return start;
        }
    }
    public static Node InsEnd(Node start)
    {
       if(start == null)
       {
         start = create(start);
         return start;
       }
       else
       {
          System.out.println("Enter reg no: ");
          int r = sc.nextInt();
          System.out.println("Enter your marks: ");
          float m = sc.nextFloat();
          Node new_node = new Node(r,m);
          Node temp = start;
          while(temp!= null)
          {
            temp = temp.next;
          }
          temp.next = new_node;
          System.out.println("Node inserted at the end....");
          return start;
       }
    }
    public static Node InsAny(Node start)
    {
      System.out.println("Enter the position to insert at: ");
      int n = sc.nextInt();
      System.out.println("Enter reg no: ");
      int r = sc.nextInt();
      System.out.println("Enter marks: ");
      float m = sc.nextFloat();
      Node new_node = new Node(r, m);
      if(start == null)
       {
         start = create(start);
         return start;
       }
      if(n==1)
      {
        return InsBeg(new_node);
      }
      else
      {
      int c=1;
      Node temp = start;
      while(c<n-1)
      {
        temp = temp.next;
      }
      Node x = temp.next;
      temp.next = new_node;
      new_node.next = x;
      System.out.println("New node inserted at " + n + " position.");
      return start;
      }

    }
    public static Node DelBeg(Node start)
    {
      if(start == null)
      {
        System.out.println("List is empty.");
      }
      else
      {
         start = start.next;
      }
      return start;
    }
    public static Node DelEnd(Node start)
    {
      if(start == null)
      {
        System.out.println("List is empty.");
      }
      else if (start.next == null)
      {
         start = null;
         System.out.println("End node deleted...");
      }
      else 
      {
        Node temp = start;
        while(temp.next.next != null)
        {
          temp = temp.next;
        }
        temp.next = null;
        System.out.println("End node deleted....");
        
      }
      return start;
      }
      public static Node DelAny(Node start)
      {
        System.out.println("Enter the position for node to be deleted: ");
        int n = sc.nextInt();
        if(n ==1 )
        {
          start = start.next;
        }
        else
        {
          Node temp = start;
          int c=1;
          while(c<n-1)
          {
            c++;
            temp = temp.next;
          }
          Node x = temp.next;
          Node y = x.next;
          temp.next = y;
          x.next = null;
          System.out.println("Node deleted at " + n + " position.");
        }
        return start;
      }
      public static Node delByRegno(Node start)
      {
        if(start == null)
        {
          System.out.println("List is empty.");
          return start;
        }
        System.out.println("Enter reg no to delete: ");
        int regno = sc.nextInt();
        if(start.regd_no == regno)
        {
          System.out.println("Node with reg no " + regno + "deleted successfully.");
          return start.next;
        }
        Node x = start;
        Node y = null;
        boolean key = true;
        while(x!= null)
        {
          if(x.regd_no == regno)
          {
             y.next = x.next;
             x.next = null;
             System.out.println("Node with reg no "+ regno + " deleted successfully." );
             key = false;
             return start;
          }
          y=x;
          x=x.next;
        }
        try
        {
          if(key)
          {
            throw new NullPointerException();
          }
        }
          catch(NullPointerException e)
          {
            System.out.println("Node with reg no " + regno + " not found in the list.");
          }
        
         return start;
       }
    
    public static void search(Node start)
    {
      if(start )
    }
  }



