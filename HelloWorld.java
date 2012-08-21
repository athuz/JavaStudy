import java.io.*;

public class HelloWorld{
		
	public static void main(String[] args){
		String name = null;
		
		//Print message to screen
		System.out.println("Enter name : ");
		
		//Get input from user
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			name = br.readLine();
		}
		catch(IOException e){
			System.out.println("Error in reading");
			System.exit(1);
		}
		
		//Print back the name
		System.out.println("Hello " + name);
	}
}