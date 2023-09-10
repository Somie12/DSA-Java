import java.util.Scanner;


public class Q2 
{
   public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter weight in kg: ");
    double w = sc.nextDouble();
    System.out.println("Enter height in metres: ");
    double h = sc.nextDouble();
    double bmi = w/(h*h);
    String s = "";
    if(bmi<18.5)
    {
        s = "Underweight";
    }
    else if(bmi>18.5 && bmi <24.9)
    {
        s = "Normal weight";
    }
    else if(bmi >25.0 && bmi < 29.9)
    {
        s = "Overweight";
    }
    else 
    {
        s = "Obese";
    }
    System.out.println("The person is " + s + ".");
    sc.close();
}
}
