import java.util.*;

interface cab3
{
	public int book(String source,String dest);
}
public class LEwithreturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cab3 c= (source,dest)-> {System.out.println("Cab booked from "+source+" to "+dest+" Arriving soon");
		return 900;
		};
		
		int fare= c.book("chennai", "salem");
		System.out.println("Fare is "+fare);

	}

}
