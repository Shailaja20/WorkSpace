package java_Program;


public class Pallindrome {

	public static void main(String[] args) {
		
     String str="LIRIL";
     
 	String reverse=" ";
 	
     System.out.println(str.length());
     
	for(int i=str.length()-1; i>=0; i--){
		System.out.print(str.charAt(i));
		reverse=reverse+str.charAt(i);
		}
	System.out.println();
	if(str.equalsIgnoreCase(reverse)){
		System.out.println("Pallindrome");
	}else{
		System.out.println("Not Pallindrome");
	}
	}
	}	


