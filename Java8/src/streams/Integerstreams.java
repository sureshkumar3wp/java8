package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Integerstreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("------------using range method");
        IntStream.range(1, 10)
        .forEach(System.out::println);
        
        System.out.println("------------using range closed method");
        IntStream.rangeClosed(1, 10)
        .forEach(System.out::println);
        
      
		System.out.println("---------------using skip method");
		IntStream.range(1, 10)
		.skip(5)
		.forEach(System.out::println);
	
		System.out.println("-------------using Sorted");
		Stream.of("Suresh","kumar","Balakrishnan")
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("------------using findFirst &&& if present");
		Stream.of("Suresh","kumar","Balakrishnan")
		.findFirst()
		.ifPresent(System.out::println);
		
		System.out.println("-------------------using Filter ");
		String[] names= {"suresh","kumar","sk","balakrishnan"};
		Arrays.stream(names)
		.filter(x->x.startsWith("s"))
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("-------------------using mapping");
		Arrays.stream(new int[]{1,2,3,4,5,6})
		.map(x -> x*x)
		.forEach(System.out::println);
		
		System.out.println("-----------------------using map to upper case");
		List<String> ls = Arrays.asList("suresh","kumar","sk","balakrishnan");
		ls.stream().map(String :: toUpperCase)
		.forEach(System.out::println);
		
		System.out.println("-----------------------using map to lowercase");
		List<String> ls1 = Arrays.asList("suresh","KUMAR","sk","balakrishnan");
		ls1.stream().map(String :: toLowerCase)
		.forEach(System.out::println);
		
		//any match and all match can be only used by boolean
		System.out.println("-----------------------------using any match");
		boolean b =IntStream.of(1,2,3,4,5,6)
		.anyMatch(num -> num%2==0);
		System.out.println(b);
		
		System.out.println("-----------------------------using all match");
		boolean b1 =IntStream.of(1,2,3,4,5,6)
		.allMatch(num -> num%2==0);
		System.out.println(b1);
		
	    System.out.println("---------------------using collectors");
	  List<String> ll = Arrays.asList("a","b","c","d");
	  
	   String concat= ll. stream()
	    .collect(Collectors.joining());
	   System.out.println(concat);
	   
	   String concat1= ll. stream()
			    .collect(Collectors.joining(","));
			   System.out.println(concat1);
			   
	  System.out.println("----------------------using  to list");
	  List<String> names1= Arrays.asList("suresh","kumar","sk","bala","krish");
	  List<String> result= names1.stream().filter(x -> x.startsWith("s")).collect(Collectors.toList());
	  System.out.println(result);
	    
	    
		
	
	}

}
