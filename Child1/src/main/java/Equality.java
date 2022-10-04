

class Person
{ 
	String name;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	Person(String name)
{this.name = name;
}


}
public class Equality 
{
public static void main(String args[])
{
Person pl = new Person("ashay"); 
Person p2 = new Person("ashay"); 
if (pl == p2) 
	System.out.println("Equal");
else
	System.out.println("Not equal"); 
if (pl.equals(p2))
	System.out.println("Equal");
else System.out.println("Not equal"); 
}
}
/*Correct Option? A.) Not Equal Equal 
B.) Equal Not Equal 
C.) Equal Equal 
D.) Not Equal Not Equal 
*/