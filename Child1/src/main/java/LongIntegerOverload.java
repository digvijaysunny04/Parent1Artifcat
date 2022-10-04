

// static overload long integer

public class LongIntegerOverload
{
public static void getInfo(int val)
{
System.out.println("integer");
}
public static void getInfo(float val)
{
System.out.println("float");
}
public static void getInfo(double val)
{
System.out.println("double");
}
public static void getInfo(long val)
{
System.out.println("long");
}
public static void main(String args[])
{
getInfo(12.0);
}
}