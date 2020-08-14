package datetime;

import java.util.*;
import java.time.*;
public class Timeeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Current Time");
        
        LocalTime t=LocalTime.now();
        System.out.println(t);
        
        System.out.println("specified time");
        LocalTime tt= LocalTime.of(12, 00);
        System.out.println(tt);
        
        System.out.println("Specified time method 2");
        LocalTime ttt= LocalTime.of(12, 01, 01);
        System.out.println(ttt);
        
        System.out.println("specified time method 3");
        LocalTime tttt= LocalTime.of(12, 01, 01, 0001);
        System.out.println(tttt);
        
        System.out.println("specified zone");
        for(String s : ZoneId.getAvailableZoneIds())
        	{System.out.println(s);
        	
        	}

        LocalTime t1= LocalTime.now(ZoneId.of("America/Chicago"));
        System.out.println(t1);
	}

}
