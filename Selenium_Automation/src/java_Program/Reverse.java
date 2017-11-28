package java_Program;

public class Reverse {
	
	public String ReverseAString(String str){

			String[] words = str.split(" ");
			String reverseWord = "";
			
			for(String w: words){
				StringBuilder sb= new StringBuilder(w);
				sb.reverse();
				reverseWord+=sb.toString()+" ";
				}
			return reverseWord.trim();  
	
	}

	public static void main(String[] args) {
			Reverse rev=new Reverse();
		    System.out.println(rev.ReverseAString("    Hello World    "));
		    System.out.println(rev.ReverseAString("SHAILAJA SHARMA"));


	}

}
