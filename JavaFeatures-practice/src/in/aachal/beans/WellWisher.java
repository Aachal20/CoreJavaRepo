package in.aachal.beans;

import java.awt.geom.GeneralPath;

//remove test class
public class WellWisher {
	public static void wish(Greeting greeting) {
		greeting.greet();
	}

	public static void main(String[] args) {
		
	wish(new Greeting() {
		
		@Override
		public void greet() {
		System.out.println("Namskar ......!! ");
			
		}
	});
	
		
		wish(new Greeting() {

			@Override
			public void greet() {
				System.out.println("Hello .....GM");
				
			}
			
			
		});
		
		
		//LE
		//Greeting  english = (() ->System.out.println("Hellow..........!!! GM"));
		//english.greet();
	   
		//Greeting  hindi = (() ->System.out.println("namsakarr..........!!! GM"));
		 //  hindi.greet();
	}
}
//anonymous impl
//this approach is not recomended