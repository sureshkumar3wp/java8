package Interfaceexamples;




import java.util.*;

// class has more priority than default interface 
interface i
{
	void show1();
	default void show() {
		System.out.println("In interface I");
	}
}
interface j
{
	default void show()
	{
		System.out.println("In interface j");
	}
}
class A
{
	public void show()
	{
	   System.out.println("A");
	}
}
 class C extends A implements i
{

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		System.out.println("IN show1");
	}
     
      
	
}
public class defaulteg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C ob = new C();
		ob.show();

	}

}
