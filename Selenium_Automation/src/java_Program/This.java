package java_Program;

public class This {
	
	int i=20; 
	This(int x){  
	this();  
	System.out.println(x);  
	}
	
	This(){System.out.println("hello a");} 
	//B(){System.out.println("hello b");} 

		
	public void main(String args[]){  
	This a=new This(10);  
	} 
}
