package ioEnhancement;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class Findfiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path p = Paths.get("C:\\Users\\suresh kumar\\Documents\\IO");
		try(Stream<Path> matches = Files.find(p, 1, (path,BasicFileAttributes)->String.valueOf(path).endsWith(".txt")))
		{
			matches.map(path->path.getFileName()).forEach(System.out::println);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
