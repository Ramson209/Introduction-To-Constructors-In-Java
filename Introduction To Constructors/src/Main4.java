class Complicate{
	private double real,img;
	
	// 1. two argument constructor
	// the only constructor for this class and hence
	// it is mandatory for the user (who is creating 
	// the object) to select this constructor .
	
	public Complicate(double r , double i) {
		real = r ;
		img =  i;
	}
	
	void print () {
		System.out.println(real + "+i " + img);
	}
}
public class Main4
{

	public static void main(String[] args)
	{
		Complicate c1,c2,c3 ;
		
		//invalid - no argument constructor is 
		// not defined for the class.
		
		c1 = new Complicate(0, 0); //error
		
		// invalid -one argument constructor is not defined for the class
		
		c2 = new Complicate(10, 0); //error
		
		//valid - initialized using two argument constructor.
		
		c3 = new Complicate(50,4);
		
		//c1.print();
		//c2.print();
		
		c3.print();

	}

}
