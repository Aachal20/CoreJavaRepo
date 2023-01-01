package in.demo.inheritance.HAS_A;
//https://www.studytonight.com/java/aggregation.php
public class Pulsor extends Bike {
	
	 public void PulsarStartDemo()  
	    {  
		 //HAS-A
	        Engine PulsarEngine = new Engine();  
	        PulsarEngine.stop();  
	    }  
}
