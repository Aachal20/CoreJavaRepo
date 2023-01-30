package in.aachal.beans;

import java.awt.geom.GeneralPath;


public class WellWisher3 {

	public static void main(String[] args) {

		Greeting hindi = () -> System.out.println("Namsakr ..........");
		hindi.greet();

		Greeting	english = () ->  System.out.println("Hello .........GM!!");
		english.greet();
	}

}
