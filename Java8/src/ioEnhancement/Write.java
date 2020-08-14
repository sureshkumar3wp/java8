package ioEnhancement;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path p =Paths.get("C:\\Users\\suresh kumar\\Documents\\IO\\data1.txt");
		String s= "India is beatiful country";
		Path write1 = Files.write(p, s.getBytes(), StandardOpenOption.WRITE);
		System.out.println(write1.toUri().getPath());
		
		System.out.println("-------------------------------------------");
		Path p1 =Paths.get("C:\\Users\\suresh kumar\\Documents\\IO\\data2.txt");
		List<String> ls = new LinkedList<>();
		ls.add("suresh");
		ls.add("kumar");
		ls.add("balakrishnan");
		Path write = Files.write(p1, ls, Charset.forName("UTF-8"),StandardOpenOption.WRITE );
		System.out.println(write.toUri().getPath());
		

	}

}
