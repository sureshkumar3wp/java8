package ioEnhancement;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class Readalllines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path p = Paths.get("C:\\Users\\suresh kumar\\Documents\\IO\\demoeg1.txt");
		
		try {
			List<String> rd= Files.readAllLines(p);
			for(String s:rd)
			{
				System.out.println(s);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	System.out.println("----------------------------------------------");
	newbufferreader();
	
	}
	private static void  newbufferreader()
	{
		Path pp = Paths.get("C:\\Users\\suresh kumar\\Documents\\IO\\demoeg1.txt");
		try {
			BufferedReader bf= Files.newBufferedReader(pp);
			Stream<String> lines = bf.lines();
			lines.forEach(System.out::println);	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
