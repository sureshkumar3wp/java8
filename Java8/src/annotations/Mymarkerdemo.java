package annotations;


@interface MyMarkerAnnotation
{

}

public class Mymarkerdemo
{
	@MyMarkerAnnotation
	public void display()
	{
		System.out.println("Hi");
	}

	public static void main(String args[])
	{
		Mymarkerdemo markerAnnotationDemo = new Mymarkerdemo();
		markerAnnotationDemo.display();
	}
}