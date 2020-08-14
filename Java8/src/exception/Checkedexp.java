package exception;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class Checkedexp {

	public static void main(String[] args){
	try {
		FileWriter wr= new FileWriter("C:\\Users\\suresh kumar\\Documents\\ss.txt");
		wr.write("here is suresh");
		wr.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println(e);
	}
	
}
}