package com.ashique.propertyAnnot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service("fileService")
public class FileServiceImp implements FileService {

		@Value("${sourceLocation:c:/temp/input}")
	    private String source;
	 
	    @Value("${destinationLocation:c:/temp/output}")
	    private String destination;
	 
	    @Autowired
	    private Environment environment;
	    
	    public void readValues() {
	    	
	    	String p1=environment.getProperty("jdbc.driverClassName");
	    	System.out.println("Getting property via Spring Environment :"+p1);
		
	    	System.out.println("Source Location : " + source);
	    	System.out.println("Destination Location : " + destination);
		
		
	    }

}
