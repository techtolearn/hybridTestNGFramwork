package dateProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ConfigDataProvider {
	Properties  pro;
	
	public ConfigDataProvider(){
		File src = new File("C:/BBD_FrameWork/com.HybridTestNGFrameWork/Configuration/config.properties");

		try {
			FileInputStream fist = new FileInputStream(src);
			pro =  new Properties();
			pro.load(fist);
			
		} catch (Exception e) {
			
			System.out.println("Exception is :"+e.getMessage());
	
		}
	}

	public String getChromePath(){
		String chrom = pro.getProperty("chromePath");
		return chrom;
	}
	public String getIEPath(){
		String ie = pro.getProperty("IEPath");
		return ie;
	}
	public String getFirefoxPath(){
		String fire = pro.getProperty("FirefoxPath");
		return fire;
	}
	public String getApplicationUrl(){
		String url = pro.getProperty("url");
		return url;
	}
}
