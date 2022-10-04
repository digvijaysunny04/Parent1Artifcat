// compile super will be 1

/*
 * class Base { public Base() { System.out.println("base"); }
 * 
 * } public class Derived extends Base{
 * 
 * 
 * public Derived() { System.out.println("derived"); super(); } public static
 * void main(String[] args) { // TODO Auto-generated method stub Derived obj
 * =new Derived(); }
 * 
 * }
 */


// compile super will be 1

class Base
{
	public static void  task()
	{
		System.out.println("base");
	}
	
}
public class Derived  extends Base{

	
	public static void  task()
	{
		System.out.println("derived");
		//super();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Base obj =new Derived();
obj.task();
	}

}
