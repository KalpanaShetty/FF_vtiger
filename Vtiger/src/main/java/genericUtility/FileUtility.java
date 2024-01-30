package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtility {
	
	/**
	 * This method will return the value from the properties file according to the key passed as argument
	 * @author KalpanaShetty
	 * @param key
	 * @return
	 * @throws Throwable
	 */
public String readDataFromPropertryFile(String key) throws Throwable {
	FileInputStream fis= new FileInputStream(IpathConstants .PropertyFilePath);
	Properties properties= new Properties();
	properties.load(fis);
	String value = properties.getProperty(key);
	return value;
}
}
