package stringjoiner;
import java.util.*;

public class demoeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using String Joiner--------------------------");
		StringJoiner joiner= new StringJoiner(" ");
		joiner.add("How").add("are").add("you");
		System.out.println(joiner);
		
		
		//2. with prefix and suffix
		System.out.println("Using prefix and suffix-----------------------------");
		StringJoiner joiner2 = new StringJoiner(" ","[","]");
		joiner2.add("India").add("is").add("beautiful");
		System.out.println(joiner2);
		
		//3. using merge option
		
		System.out.println("using merge option---------------------------------");
	    StringJoiner str= joiner.merge(joiner2);
	    System.out.println(str);
	    
		

	}

}
