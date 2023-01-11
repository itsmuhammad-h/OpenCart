package genericlibraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileData {

	
	public String getdata(String key) throws IOException //declare method as void when we read the data in baseclass we get error click on it and correct it as String type from void just follow autosuggestion
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(AutoConstant.propertyfilepath);
	     p.load(fis);
		  return p.getProperty(key);
		
	}
	
}
