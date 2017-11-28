package java_Inheritance;

public class Test_Inheritance {
	
	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		
		
		rec.set_values(10, 10);
		tri.set_values(10, 10);
		
		System.out.println("Rectangular area is :" +rec.Area());
		System.out.println("Triangular area is :" +tri.area());

	}

}
