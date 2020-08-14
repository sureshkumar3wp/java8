package Interfaceexamples;

interface phone
{
	void call();
	default void method()
	{
		System.out.println("SENT");
	}
}
class androidphone implements phone
{
	public void call()
	{
		System.out.println("CALLING");
	}
}
public class defaultrealeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phone p = new androidphone();
		p.call();
		p.method();

	}

}
