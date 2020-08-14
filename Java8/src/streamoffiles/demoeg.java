package streamoffiles;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;


public class demoeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path p=  Paths.get("C:\\Users\\suresh kumar\\Documents\\ss.txt");
		try(Stream<String> lines=Files.lines(p)) {
			lines.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("----------------------------------------");
		Path p1=  Paths.get("C:\\Users\\suresh kumar\\Documents\\ss.txt");
		try(Stream<String> lines=Files.lines(p1, Charset.forName("UTF-8"))) {
			lines.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
