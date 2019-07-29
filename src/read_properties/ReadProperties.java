package read_properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
	public static void main(String[] args) {
		try {
			InputStream in = ReadProperties.class.getClassLoader()
					.getResourceAsStream("read_properties/example.properties");
			Properties properties = new Properties();
			properties.load(in);
			System.out.println(properties.getProperty("java.username"));
			System.out.println(properties.getProperty("java.password"));
			System.out.println(properties);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
