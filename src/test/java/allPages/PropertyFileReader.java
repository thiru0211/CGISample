package allPages;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertyFileReader {
	

	
	public static Map<String,String> propertymap=new HashMap<String,String>();

	public static void propertyRead(){
		 
		try {
			FileReader fr = new FileReader("Data.properties");
			Properties pr=new Properties();
			pr.load(fr);
			
			for (Object key :pr.keySet()) {
//				System.out.println(key+"="+pr.getProperty(key.toString()));
				propertymap.put(key.toString(), pr.getProperty(key.toString()));
				System.out.println(propertymap);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}