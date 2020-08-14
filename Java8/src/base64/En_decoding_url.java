package base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class En_decoding_url {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub


		final String str="https://www.youtube.com/watch?v=MLad3kMLJug&list=PLzS3AYzXBoj8Fm19MdV3jqZOCLOh984xK&index=55";
		System.out.println("------------------------------------------------------");
		System.out.println("original string ---"+str);
		 String encodedstr = Base64.getUrlEncoder().encodeToString(str.getBytes("UTF-8"));
		 System.out.println("Encoded String ---" +"\t"+encodedstr);
		 
		 System.out.println("----------------------------------------------");
		 
		 byte[] bytearr=Base64.getUrlDecoder().decode(encodedstr);
		 String decodedstr = new String(bytearr,"UTF-8");
		 System.out.println("Decoded String --------"+decodedstr);
	}

}
