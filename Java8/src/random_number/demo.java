package random_number;

import java.util.*;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int nextInt=r.nextInt(100000000);
		System.out.println(nextInt*8);

	}

}

