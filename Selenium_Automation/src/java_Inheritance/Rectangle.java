package java_Inheritance;

public class Rectangle extends Polygon {
	
	public double Area(){
		return (height*width);
		
	}
	
	public static void main(String args[])
	{
		Polygon p=new Rectangle();
		Rectangle r=(Rectangle) new Polygon();
	}

}
