import java.util.*;
class InvalidBalanceException extends Exception
{
    InvalidBalanceException(String message)
    {
        super(message);
    }
}
public class HAQ1 
{
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter name: ");
     String name = sc.nextLine();
     System.out.println("Enter account number: ");
     int accno = sc.nextInt();
     System.out.println("Enter balance: ");
     double balance = sc.nextDouble();
     try
     {
        Bank bank = new Bank(accno, name, balance);
        System.out.println("Details of account holder: ");
        System.out.println("Name: " + bank.getName());
        System.out.println("Account Number: " + bank.getAccNumber());
        System.out.println("Balance: " + bank.getBalance());
        System.out.println("Enter the money to withdraw: ");
        double amt = sc.nextDouble();
        bank.withdraw(amt);
        System.out.println("After withdrawing, balance: " + bank.getBalance());
     }
     catch(InvalidBalanceException e)
     {
        System.out.println(e);
     }
     sc.close();
   }
}
class Bank
{
    int accno;
    String name;
    Double balance;
    public Bank(int accno, String name, Double balance)throws InvalidBalanceException
    {
      if(balance <0)
      {
         throw new InvalidBalanceException("Balance cannot be less than 0");
      }
      this.accno = accno;
      this.name = name;
      this.balance = balance;
    }
    public void withdraw(double amt)throws InvalidBalanceException
    {
       if(amt > balance)
       {
         throw new InvalidBalanceException("Balance cannot be less than 0");
       }
       balance -= amt;
    }
    public int getAccNumber()
    {
        return accno;
    }
    public String getName()
    {
        return name;
    }
    public double getBalance()
    {
        return balance;
    }
}
