package com.basicRequirements;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PathProperties {
	
	public Properties obj;
	FileInputStream objfile;
	public PathProperties() throws IOException {
		
		obj = new Properties();
		objfile = new FileInputStream("src\\test\\resources\\Properties\\ObjectRepositiry.properties");
		obj.load(objfile);
	}

}
