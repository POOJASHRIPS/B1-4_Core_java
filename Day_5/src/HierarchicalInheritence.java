
package Day_5;
class CellPhones
{
	void message()
	{
		System.out.println("Hi");
	}
	void call()
	{
		System.out.println("How you doin");
	}
}
class SamsungGalaxyM31 extends CellPhones
{
	void facelock()
	{
		System.out.println("Modern Facelock");
	}
}
class OnePlus extends CellPhones
{
	void games()
	{
		System.out.println("PUB-G");
	}
}
public class HierarchicalInheritance 
{

	public static void main(String[] args)
	{
		OnePlus o=new OnePlus();
		o.games();
		o.message();
		o.call();
		SamsungGalaxyM31 m=new SamsungGalaxyM31();
		m.facelock();


	}

}