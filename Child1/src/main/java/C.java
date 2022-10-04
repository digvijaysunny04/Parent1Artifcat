

class P
{
public void getInfo()
{
System.out.println("Parent class");
}
}
public class C  extends P
{
public int getInfo(String val)
{
System.out.println("Child class"); return 1;
}
public static void main(String[] args)
{
C obj = new C();
obj.getInfo();
}}