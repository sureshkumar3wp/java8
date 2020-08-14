package reduction;

import java.util.*;
import java.util.stream.IntStream;

public class Demoeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OptionalInt red=IntStream.range(1, 6).reduce((a,b)->a+b);
		System.out.println(red.getAsInt());
		
		//1+2+3+4+5
		
		System.out.println("------------------------");
		
		int red2=IntStream.range(1, 6).reduce(10, (a,b)->a+b);
		System.out.println(red2);
		
		System.out.println("------------------------");
		Integer reduce= Arrays.asList(1,2,3,4,5,6).parallelStream()
				.reduce(10, (a,b)->a+b, (a,b)->{
				
					return a+b;
				});
		System.out.println(reduce);
	}

}
