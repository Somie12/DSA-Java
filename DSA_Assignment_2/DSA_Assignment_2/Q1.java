public class Q1
{
    public static void main(String[] args)
    {
       Phone phone1 = new Phone();
       phone1.area_code = 212;
       phone1.exchange = 767;
       phone1.number = 8900;

       Phone phone2 = new Phone();
       phone2.input(415, 5555, 01212);

       System.out.println("My number is: ");
       phone1.display();

       System.out.println("My number is: ");
       phone2.display();

    }
}
class Phone
{
 int area_code;
 int exchange;
 int number;
 void input(int a, int e, int n)
 {
    area_code = a;
    exchange = e;
    number = n;
 }
 void display()
 {
    System.out.println("( " + area_code + " ) " + exchange + " "+ number);
 }

}