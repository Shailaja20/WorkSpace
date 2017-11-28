package java_Program;

public class Reverse_A_String {

	public static void main(String[] args) {

		String str="NAGESH";
		System.out.println(str.length());
		
		// Print in normal order
		for(int i=0; i<str.length(); i++){
			System.out.print(str.charAt(i));
		}
		System.out.println();
		// Print in reverse order
		for(int i= str.length()-1; i>=0; i--){
			System.out.print(str.charAt(i));
			
		}

	}
}

