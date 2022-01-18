package Assignment;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class service {
	
	
	public void urlreading() 
	{
		try {
	         // get URL content
			 	String inputLine;
	     	    String a = "https://www.facebook.com/";
		         URL url = new URL(a);
		         URLConnection conn = url.openConnection();
		 
	     	
		         PrintStream myconsole=new PrintStream(new File("D://web_content.txt"));
	             BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

	             
	         while ((inputLine = br.readLine()) != null) 
	         {
	             System.out.println(inputLine);
	             myconsole.print(inputLine);
	         }
	         
	         br.close();
	         System.out.println("Program Sucessfully worked");

	     } 
		 
		catch (MalformedURLException e) {
	         e.printStackTrace();
	     } 
			
			catch (IOException e) 
			{
	         e.printStackTrace();
			}
	   }
}	
	


