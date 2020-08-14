package predefinedfunctionalinterface;
import java.util.*;
import java.util.function.BiPredicate;

public class Bipredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
       BiPredicate<Integer, String> biPredicate=(i,o)->i>20&& o.startsWith("S");
		
		System.out.println(biPredicate.test(30, "Sean"));
		System.out.println(biPredicate.test(40, "Martin"));
		System.out.println(biPredicate.test(10, "Frank"));
	}

}
