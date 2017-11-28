package java_Program;

public class StringPallindrome {
	
	public void Pallindrome(String str)
	{
		String reverse="";
		
		System.out.println(str.length());
		
		for(int i=str.length()-1; i>=0 ; i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println("Reversed string is "+reverse);
		if(reverse.equalsIgnoreCase(str))
		{
			System.out.println("Pallindrome");
		}else{
			System.out.println("Not a Pallindrome");
		}
	}

	public static void main(String[] args) {
		StringPallindrome string=new StringPallindrome();
		string.Pallindrome("SHAILAJA");
		string.Pallindrome("LIRIL");

	}

}
