package math;

import java.util.*;
public class Demoeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------using addExact");
		int addExact = Math.addExact(Integer.MIN_VALUE,10000 );
		System.out.println(addExact);
		
/*		int addExact2 = Math.addExact(Integer.MAX_VALUE, 1);
		System.out.println(addExact2);
*/		
		int data =Integer.MAX_VALUE+2;
		System.out.println(data);
		System.out.println("-------------------using subtractExact");
		int subtractExact = Math.subtractExact(2000, 34);
		System.out.println(subtractExact);
		
		System.out.println("-----------------------Using multiplyExact");
		long multiplyExact = Math.multiplyExact(10L, 200L);
		System.out.println(multiplyExact);
		
		System.out.println("----------------Using increment exact");
		long incrementExact = Math.incrementExact(50000L);
		System.out.println(incrementExact);
		
		System.out.println("----------------Using decrement exact");
		long dc = Math.decrementExact(5000L);
		System.out.println(dc);
		
		System.out.println("----------------using negatate exact");
		long negateExact = Math.negateExact(5000L);
		System.out.println(negateExact);
		
		System.out.println("----------------------using floor div");
		int fl= Math.floorDiv(45, 4);
		System.out.println(fl);
		
		System.out.println("----------------Using next down");
		double nextDown = Math.nextDown(Double.NaN);
		System.out.println(nextDown);
		
		double nextDown2 = Math.nextDown(Double.NEGATIVE_INFINITY);
		System.out.println(nextDown2);
		
		double nextDown3 = Math.nextDown(0);
		System.out.println(nextDown3);
		
		double nextDown4 = Math.nextDown(2);
		System.out.println(nextDown4);
		
		double nextDown5 = Math.nextDown(-2);
		System.out.println(nextDown5);
	}

}
