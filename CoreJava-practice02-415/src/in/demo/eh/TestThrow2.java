package in.demo.eh;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestThrow2 {   
	//function to check if person is eligible to vote or not   
	public static void mymethod() throws FileNotFoundException  {  
		if(0==0) {
			//FileReader file = new FileReader("E:\\Soft2Techno\\prepare notes\\wait.txt");  
			FileReader file = new FileReader("E:\\Soft2Techno\\prepare notes\\wa.txt");  
			// BufferedReader fileInput = new BufferedReader(file);  
			System.out.println("file found");

		}
		else {
			throw new FileNotFoundException();    //checked exception
		}
	}  
	//main method  
	public static void main(String args[]){  
		try  
		{  
			mymethod();  
		}   
		catch (FileNotFoundException e)   
		{  
			e.printStackTrace();  
		}  
		System.out.println("rest of the code...");    
	}    
}    