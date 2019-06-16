package factory;

import dateProvider.ConfigDataProvider;
import dateProvider.ExcelDataPriovider;

public class DataProviderFactory {

	
	public static ConfigDataProvider getConfig(){
		ConfigDataProvider  config = new ConfigDataProvider();
		return config;
		
	}
	public ExcelDataPriovider getExcel(){
		ExcelDataPriovider excel = new ExcelDataPriovider();
		return excel;
	}
}
