import java.util.*;


interface cab
{
	public void  bookcab();
}




public class LambdawithFI {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cab c= new cab()
				{
			public void bookcab()
			{
				System.out.println("Cab is boookeed,..... Arriving Sooon!!!!");
			}
			
				};
				
				c.bookcab();
				
				//2. with lambda
		/*cab c= ()->System.out.println("Cab Booked,...... arriving soooon!!!!");
		c.bookcab();
		*/
			

	}

}
