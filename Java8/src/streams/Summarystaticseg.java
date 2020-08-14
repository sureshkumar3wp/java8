package streams;

import java.util.*;
import java.util.stream.IntStream;

public class Summarystaticseg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntSummaryStatistics summary =  IntStream.of(1,2,3,4,5).summaryStatistics();
		System.out.println(summary);
		

	}

}
