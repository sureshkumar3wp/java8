package consumer;

import java.util.*;
import java.util.function.Consumer;

class Consimpl implements Consumer<Integer>
{
	public void accept(Integer i)
	{
		System.out.println(i);
	}
}
public class eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 st way
		List<Integer> values = Arrays.asList(4,5,6,7,8);
		
		Consumer<Integer> c = new Consimpl();
		values.forEach(c);

		//use anonymous
		System.out.println("Implementing the anonymous way");
		Consumer<Integer> cc= new Consumer<Integer>()
				{
			       public void accept(Integer i)
			       {
			    	   System.out.println(i);
			       }
				};
				values.forEach(cc);
				
	  // using java 8
				System.out.println("Using java 8");
				Consumer<Integer> ccc=i-> System.out.println(i);
				values.forEach(ccc);
		
	}

}
