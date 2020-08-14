package base64;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class Encoding_decoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub

		final String str="Encoding & decoding in java 8 Base 64";
		System.out.println("original string ---"+str);
		 String encodedstr = Base64.getEncoder().encodeToString(str.getBytes("UTF-8"));
		 System.out.println("Encoded String ---" +"\t"+encodedstr);
		 
		 System.out.println("----------------------------------------------");
		 
		 byte[] bytearr=Base64.getDecoder().decode(encodedstr);
		 String decodedstr = new String(bytearr,"UTF-8");
		 System.out.println("Decoded String --------"+decodedstr);
		 
		 
		 
	}

}
