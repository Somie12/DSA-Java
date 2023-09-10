public class Q6 
{
    public static void main(String[] args)
    {

    Box<String> strob1 = new Box<>("It is the object of Box String");
    Box<String> strob2 = strob1;
    System.out.println("String variable_1 contains: " + strob1.get());
    System.out.println("String variable_2 contains: " + strob2.get());
    strob1.set("Changed");
    System.out.println("String variable_1 contains: " + strob1.get());
    System.out.println("String variable_2 contains: " + strob2.get());
    Box<Integer> intob1 = new Box<>(9588);
    Box<Integer> intob2 = intob1;
    System.out.println("Integer variable_1 contains: " + intob1.get());
    System.out.println("Integer variable_2 contains: " + intob2.get());
    intob1.set(20);
    System.out.println("Integer variable_1 contains: " + intob1.get());
    System.out.println("Integer variable_2 contains: " + intob2.get());
    Box <Object> object1 = new Box<>(new Object());
    Box<Object> object2 = object1;
    System.out.println("Object variable_1 contains: " + object1.get());
    System.out.println("Object variable_2 contains: " + object2.get());
    object1.set("String subsituted in the object.");
    System.out.println("Object variable_1 contains: " + object1.get());
    System.out.println("Object variable_2 contains: " + object2.get());
    object1.set(10);
    System.out.println("Object variable_1 contains: " + object1.get());
    System.out.println("Object variable_2 contains: " + object2.get());
    }    
}
class Box<T>
{
    public T t;
    public Box(T t)
    {
        this.t = t;
    }
    public T get()
    {
        return t;
    }
    public void set(T t)
    {
        this.t = t;
    }
}
