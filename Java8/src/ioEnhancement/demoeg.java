package ioEnhancement;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class demoeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Path p = Paths.get("C:\\Users\\suresh kumar\\Documents\\IO\\demoeg1.txt");
         
         try(Stream<String> lines=Files.lines(p)){
        	 Optional<String> op = lines.filter(s->s.contains("line 10")).findFirst();
        	 if(op.isPresent())
        	 {
        		 System.out.println(op.get());
        	 }
        	 else
        	 {
        		 System.out.println("Not found");
        	 }
        	 
         }catch(Exception e)
         {
        	 e.printStackTrace();
         }
	}

}
