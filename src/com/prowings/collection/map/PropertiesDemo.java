package com.prowings.collection.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties prop = new Properties();
		
		prop.setProperty("dbusername", "abc");
		prop.setProperty("dbpwd", "abc123");
		prop.setProperty("dburl", "zzzzzzzzzzzzzzzzzzzzz");
		
		
		System.out.println(prop);
		
		System.out.println(prop.getProperty("dbpwd"));
		
		System.out.println("============ Loading Prop from file==========");
		
		Properties myProp = new Properties();
		
		myProp.load(new FileInputStream("C:\\Users\\Shree\\web-app-workspace\\collection-practice\\src\\abc.properties"));
		
		System.out.println(myProp.getProperty("dbusername"));
		System.out.println(myProp.getProperty("dbpwd"));
		System.out.println(myProp.getProperty("dbid"));
		System.out.println(myProp);
		
	}

}
