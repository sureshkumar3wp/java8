import java.util.*;

interface cab1
{
	public void book(String source,String destination);
	
}
public class lambdaexpwithparam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cab1 c= (source,destination)->{
			System.out.println("Cab booked from "+source+" to "+ destination+" Arriving sooon!!!");
		};
		c.book("chennai","bangalore");
	}

}
