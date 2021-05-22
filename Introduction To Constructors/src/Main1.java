class Sample{
	//constructor
	//executed immediately after
	//object creation.
	Sample(){
		System.out.println("Hello");
	}
	
}
public class Main1
{

	public static void main(String[] args)
	{
		Sample s;//s is a refrence variable
		
		s= new Sample();
		       //object created here,
		       //immediately constructor
		       // is invoked,and you will see
		       //Hello in the output.

	}

}
