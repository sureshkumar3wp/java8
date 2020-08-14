package datetime;

import java.util.*;
import java.time.*;

public class Dateeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Current DATE");

		LocalDate d= LocalDate.now();
		System.out.println(d);

		System.out.println("Specified date");
		
		LocalDate dd= LocalDate.of(1998, 11, 03);
		System.out.println(dd);
		
		System.out.println("specified date with method 2");
		
		LocalDate ddd = LocalDate.of(1998, Month.NOVEMBER, 03);
		System.out.println(ddd);
	}

}
