class Sample1{
	private int value;
	
	// 1.no argument constructor
	
	Sample1(){
		value=10;
	}
	// 2. argument constructor
	
	Sample1 (int n){
		value = n;
	}
	
	void print() {
		System.out.println(value);
	}
}
public class Main2
{

	public static void main(String[] args)
	{
		//here (1) no argument constructor
		//selected as no value is passed
		//and hence this object is initialized
		//using no argument constructor.
		
		Sample1 s=new Sample1();
		s.print(); //10
		
		//here (2) int argument constructor
		//is selected and hence this object
		// is initialized using arg constructor.
		
		Sample1 s1 =new Sample1(100);
		s1.print();//100
			

	}

}
