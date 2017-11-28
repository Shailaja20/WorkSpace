package java_Program;

import java.io.File;

public class GetterSetterMethod {

	public static void main(String[] args) {
		
		PathSeperator path = new PathSeperator();
		
		path.setPath("C:");
		System.out.println(path.getPath());
		path.setSeperator(File.separator);
		System.out.println(path.getSeperator());
		
		System.out.println("Complete Sentence with File Seperator is " +path.getPath()+path.getSeperator()+"Hello" +path.getSeperator() +"World");

	}

}
