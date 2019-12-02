package com.cucumber.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {
	public Properties prop = new Properties();

	public ConfigReader() throws Throwable {
		try {
			File f = new File(System.getProperty("user.dir")
					+ "\\src\\test\\resource\\com\\cucumber\\prop\\Configuration.properties");
			FileInputStream fin = new FileInputStream(f);
			prop.load(fin);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Not a valid file");
		}
	}

	public String getURL() throws Exception {
		String property = prop.getProperty("url");
		if (property == null) {
			throw new Exception("Not a calid key");
		}
		return property;
	}

	public String getBrowserName() throws Exception {
		String bN = prop.getProperty("browserName");
		if (bN == null) {
			throw new Exception("Not a valid key");
		}
		return bN;
	}
}