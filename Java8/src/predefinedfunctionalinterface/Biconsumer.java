package predefinedfunctionalinterface;
import java.util.*;
import java.util.function.BiConsumer;

public class Biconsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> hs = new HashMap();
		hs.put(1, "suresh");
		hs.put(2, "kumar");
		BiConsumer<Integer,String> byr=(k,v)->System.out.println("Key:" +k +"\t"+"value : "+v);
	    hs.forEach(byr);
	    
	    System.out.println("--------------------------------------");
	    Map<Integer,student> hss = new HashMap();
	    hss.put(1000, new student("suresh",23,"Male"));
	    hss.put(1001, new student("cruze",21,"Male"));
	    
	    hss.forEach((k,v)->System.out.println("key :"+"\t"+k+"\t"+"value :"+"\t"+v));
	    

	}

}
