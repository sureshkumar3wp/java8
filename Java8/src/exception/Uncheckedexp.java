package exception;
import java.util.*;
import java.util.function.Consumer;

public class Uncheckedexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ls=  Arrays.asList(3,9,7,0,10,20);
		ls.forEach(consumerWrapper(i-> System.out.println(50/i),Exception.class));
		
	}
	private static <T,E extends Exception> Consumer<T> consumerWrapper(Consumer<T> consumer,Class<E> clazz){
		return i->{
			try {
				consumer.accept(i);
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		};
	}

}
