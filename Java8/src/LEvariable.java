import java.util.*;

interface cab4
{
	public void book();
}
public class LEvariable {

     int instvar=10;
	static int stvar=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cab4 c= ()->{System.out.println("Boooked");
		  int localvar=100;
	         System.out.println("local variable : "+localvar);
	         //System.out.println("instance variable : "+instvar);
	         System.out.println("static var : "+ LEvariable.stvar);
		
		};
         c.book();
        
		
	}

}
