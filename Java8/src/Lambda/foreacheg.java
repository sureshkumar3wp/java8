package Lambda;

import java.util.*;
public class foreacheg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//before
		for(int i=0; i<ls.size();i++)
		{
			System.out.println("ine before normal for "+ ls.get(i));
		}
		//before with for
		for(int i:ls)
		{
			System.out.println( "with for each" +i);
		}
		
		//now with lambda 
		
		ls.forEach(i ->System.out.println("With lambda" +i));
		ls.forEach(System.out::println);
		

	}

}
