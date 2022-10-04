// parent no default constru so compile time


 class Parent123
{
	
	  public Parent123(String s) { System.out.println("Parent"); }
	 

		/*
		 * public Parent123() { System.out.println("Parent no arg"); }
		 */
}
public class ParentChild extends Parent123
{
public ParentChild(String s)
{
//	super("q");
System.out.println("Child");
}
public static void main(String[] args)
{
new ParentChild("temp");
}
}