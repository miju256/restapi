package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	public Properties prop;
	
	public TestBase()  {
		 prop = new Properties();
		try {
			FileInputStream  file = new FileInputStream(new File (System.getProperty("/Users/mdgulamkibria/Desktop/bit tech"
					+ "/restApi/src/main/java/config/config.properties")));
			prop.load(file);
			}
			 catch (Exception e) {
				
				e.printStackTrace();
			}
		
		
	
	
	}
}

