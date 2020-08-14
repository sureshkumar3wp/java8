package datetime;

import java.util.*;
import java.time.*;

public class MachineReadable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Machine readable ");
		Instant in =Instant.now();
        System.out.println(in);
        
        System.out.println("bothdate and time");
        LocalDateTime dt= LocalDateTime.now();
        System.out.println(dt);
        
        
	}

}
