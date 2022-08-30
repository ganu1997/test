package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ReadConfig {
	Properties pro;
	public ReadConfig() {
		File src = new File("./configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
		
	}
	public String getURL() {
		String url_1 = pro.getProperty("url");
		return url_1;
	}
	public String getUID() {
		String userid = pro.getProperty("uid");
		return userid;
	}
	public String getPass() {
		String password = pro.getProperty("pass");
		return password;
	}
	public String getChromePath() {
		String path = pro.getProperty("chrome");
		return path;
	}
	public String getIEPath() {
		String path = pro.getProperty("IE");
		return path;
	}
}
