package ioEnhancement;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class Walk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path start= Paths.get("C:\\Users\\suresh kumar\\eclipse-workspace\\IDE\\Java8\\src");
		try {
			Stream<Path> walk= Files.walk(start, Integer.MAX_VALUE, FileVisitOption.FOLLOW_LINKS);
			walk.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
