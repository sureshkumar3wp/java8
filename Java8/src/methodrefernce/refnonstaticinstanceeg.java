package methodrefernce;

import java.util.*;
interface calculator1
{
	void add( int num1,int num2);
}
class Calc1
{
	public void addsome(int num1,int num2)
	{
		System.out.println("num1 : "+ num1 +" num 2 : "+ num2+ " Addition is : "+(num1+num2));
	}

}
public class refnonstaticinstanceeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     System.out.println("Refernce to the non static method ");
		    Calc1 calc= new Calc1();
            calculator1 cref= calc::addsome;
            cref.add(5, 7);
	}

}
