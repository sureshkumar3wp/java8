package optional;

import java.util.*;
public class demoeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Optional<String> str= Optional.empty();
		System.out.println(str);
		
		//in previous version
		System.out.println("---------------------------Using previous version");
		String book=null;
		if(book!=null)
			System.out.println(book.toUpperCase());
		else
			book="java in new"; 
			System.out.println(book.toUpperCase());
		
		
		
		//Uisng java 8
		System.out.println("----------------------Using JAVA 8");
		String book1 = "here suresh kumar" ;
		str= Optional.ofNullable(book1);
		System.out.println(str.orElse("java in else").toUpperCase());
		
		String book2 = null ;
		str= Optional.ofNullable(book2);
		System.out.println(str.orElse("java in else").toUpperCase());
	}

}
