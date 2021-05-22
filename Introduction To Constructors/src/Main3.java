//Complex number is a number with the form a + bi,it has two parts
//real part i.e.a and imaginary part i.e. b and both
// a and b are real numbers e.g. 5 +4i
class Complex{
	
	private double real,img;
	// 1. No argument constructor
	
	public Complex() {
		real=img=0;
		
	}
	
	// 2. one argument constructor
	
	public Complex(double r , double i) {
		real = r;
		img = i;
	}
	void print() {
		System.out.println(real + " +i " + img);
	}
}
public class Main3
{

	public static void main(String[] args)
	{
		Complex c1,c2,c3;
		
		// (1) selected hence real and img in c1 will be 0.
		c1 = new Complex();
		
		// (2) selected hence real =10 and img = 0 in c2
		c2= new Complex(10, 0);
		
		// (3) selected hence real =50 and img =4 in c3
		c3 = new Complex(50,4);
		
		c1.print();
		c2.print();
		c3.print();

	}

}
