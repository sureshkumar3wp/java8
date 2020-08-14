package Lambda;

import java.util.*;
interface param
{
	void show(int i, int j);
}

public class withparam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		param p;
		p=(i,j)->System.out.println("Addition is : " +(i+j));
		p.show(7, 9);

	}

}
