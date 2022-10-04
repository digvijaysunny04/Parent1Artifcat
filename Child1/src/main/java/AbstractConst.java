
//abstract final not together

abstract class Base1
{
public int a; 
Base1()
{
a = 10;
}

abstract  public void Task();
}
public class AbstractConst extends Base
{
final public void Task()
{
System.out.println("a = " );
}
public static void main(String[] args)
{
AbstractConst obj = new AbstractConst(); obj. Task();
}
}