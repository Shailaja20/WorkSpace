package java_Program;

public class Comparision_Commands {

	public static void main(String[] args) {
		
     String str="Nagesh";
     
     if(str.equalsIgnoreCase("nagesh")){
    	 System.out.println("Matching");
     }else{
    	 System.out.print("Not matching");
     }
     if(str.contains("Nag")){
    	 System.out.println("Available");
        }else{
       	 System.out.print("Not Available");
        }
	}
	

}