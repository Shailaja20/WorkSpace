package selenium_webdriver;

import org.testng.annotations.Test;

public class Constructor {

		   private String message;

		   //Constructor
		   //@param message to be printed
		   public Constructor(String message){
		      this.message = message;
		   }
		      @Test
		   // prints the message
		   public String printMessage(){
		      System.out.println(message);
		      return message;
		   }   
		}  