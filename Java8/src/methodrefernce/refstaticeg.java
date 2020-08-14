package methodrefernce;

import java.util.*;

interface calculator
{
	void add( int num1,int num2);
}
class Calc
{
	public static void addsome(int num1,int num2)
	{
		System.out.println("num1 : "+ num1 +" num 2 : "+ num2+ " Addition is : "+(num1+num2));
	}
	public static void letsadd(int num1, int num2)
	{
		System.out.println("num1 : "+ num1 +" num 2 : "+ num2+ " Add is : "+(num1+num2));
	}
}

public class refstaticeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc.addsome(5, 6);
		System.out.println("Reference to the static method"); 
		calculator cref= Calc::letsadd;
		cref.add(11, 14);

	}

}
