package comparator;
import java.util.*;
import java.util.stream.Collectors;

public class demoeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> ls = new ArrayList<>();
		ls.add(new Employee("suresh",23));
		ls.add(new Employee("kumar",35));
		ls.add(new Employee("bala",20));
		ls.add(new Employee("krishnan",30));
		ls.add(new Employee("cruze",45));
		
		System.out.println("------------Before sorting::::");
		ls.forEach(System.out::println);
		
		System.out.println("-----------After sorting::::");
		Collections.sort(ls, (e1,e2)->e1.getName().compareTo(e2.getName()));
		ls.forEach(System.out::println);
		
		System.out.println("-----------------using comparing-------");
		Comparator<Employee> cp = Comparator.comparing(Employee::getName);
		Collections.sort(ls, cp);
		ls.forEach(System.out::println);
		
		System.out.println("--------------------------using comparing int");
		List<String> ls1=Arrays.asList("suresh","kumar","bala","krishnan");
		Comparator<String> cp1 =Comparator.comparingInt(String::length);
		Collections.sort(ls1, cp1);
		ls1.forEach(System.out::println);
		
		System.out.println("-------------------using then comparing");
		List<Employee> lss = new ArrayList<>();
		lss.add(new Employee("suresh",23));
		lss.add(new Employee("kumar",35));
		lss.add(new Employee("suresh",20));
		lss.add(new Employee("krishnan",30));
		lss.add(new Employee("suresh",45));
		
	   Comparator<Employee> cc= Comparator.comparing(Employee::getName).thenComparing(Employee::getAge);
	   Collections.sort(lss, cc);
	   lss.forEach(System.out::println);
	   
		System.out.println("--------------------using natural order");
		
		List<String> nl = lss.stream().map(Employee::getName).collect(Collectors.toList());
		nl.sort(Comparator.naturalOrder());
		nl.forEach(System.out::println);
		
		
		System.out.println("--------------------using reverse order");
		
		List<String> nll = lss.stream().map(Employee::getName).collect(Collectors.toList());
		nll.sort(Comparator.reverseOrder());
		nll.forEach(System.out::println);
	
		
		
		
	}

}
