/*package in.props;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
			FileInputStream reader=new FileInputStream("in\props\info.properties");  
		Properties props = new Properties();
		props.load(reader);
		System.out.println("PropertiesDemo.main()");
		
		System.out.println(props.getProperty("person.name"));
		String property = props.getProperty("person.name");
		System.out.println(property);
	}
}
		*/