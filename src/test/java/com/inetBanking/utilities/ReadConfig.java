package com.inetBanking.utilities;

import java.io.*;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig()
	{
	  File src = new File("./Configuration/config.properties");  //src is a variable (Not oj ?)
	  try {
		  FileInputStream fis = new FileInputStream(src);
		  pro=new Properties();
		  pro.load(fis);		  
	  }catch (Exception e) {
		  System.err.println("Exception is " + e.getMessage());
	  }	  		
	}
	
	//baseURL Application URL
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}	
	public String getUsername()
	{
		String username=pro.getProperty("username");
		return username;
	}	
	public String getPassword()
	{
		String password=pro.getProperty("password");
		return password;
	}
	public String getChromePath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	public String getIEPath()
	{
		String iepath=pro.getProperty("iepath");
		return iepath;
	}
	public String getFirefoxPath()
		{
			String firefoxpath=pro.getProperty("firefoxpath");
			return firefoxpath;
		}
}
