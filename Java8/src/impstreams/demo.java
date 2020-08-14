package impstreams;
import java.util.*;
import java.util.stream.Stream;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<student> ls= new ArrayList();
       ls.add(new student(23,"suresh"));
       ls.add(new student(32,"kumar"));
       ls.add(new student(10,"octavia"));
       ls.add(new student(45,"clarke"));
       ls.add(new student(27,"bellamy"));
       ls.add(new student(20,"murphey"));
       
       Stream<student> fills=ls.stream().filter(s->s.getAge()>20);
       fills.forEach(System.out::println);
       
       System.out.println("------------------------------------------");
       
       boolean allmatch=ls.stream().allMatch(s->s.getName().contains("s"));
       System.out.println(allmatch);
       
       System.out.println("---------------------------------");
       
       boolean anymatch= ls.stream().anyMatch(s->s.getAge()>30);
       System.out.println(anymatch);
       
       System.out.println("-------------------------------");
       
       boolean nonematch=ls.stream().noneMatch(s->s.getAge()<5);
       System.out.println(nonematch);
       
       System.out.println("-----------------------");
       Stream<Object> lss=ls.stream().map(x->x.getAge()+1);
       lss.forEach(System.out::println);
       
       
       
	}

}
