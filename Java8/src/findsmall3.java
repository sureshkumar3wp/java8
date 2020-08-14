import java.util.*;
import java.util.stream.IntStream;

public class findsmall3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] numbers= {1,6,3,4,5,6};   
		IntStream.of(numbers).distinct().sorted().limit(3).forEach(System.out::println);
	}

}
