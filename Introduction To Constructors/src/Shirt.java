
public class Shirt
{
public static  String colour;
public static  char size;

Shirt (){}

Shirt (String newColour,char newSize){
	colour=newColour;
	size=newSize;
	
}

 void putOn() {
	System.out.println("Shirt is on !");
}
 void putoff() {
	System.out.println("Shirt is off");
}
public void setColor(String newColour) {	
	colour=newColour();
	
	
}


private String newColour()
{
	// TODO Auto-generated method stub
	return null;
}
public void setSize(char newSize) {
	size=newSize();
}
private char newSize()
{
	// TODO Auto-generated method stub
	return 0;
}

}