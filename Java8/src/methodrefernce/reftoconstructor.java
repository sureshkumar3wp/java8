package methodrefernce;
import java.util.*;

interface Messenger
{
	Message getmessage(String msg);
}
class Message
{
	Message(String msg)
	{
		System.out.println(msg);
	}
}
public class reftoconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Refernce to the constructor");
        Messenger ms = Message::new;
        ms.getmessage("search candle instead of crushing darknesss");
	}

}
