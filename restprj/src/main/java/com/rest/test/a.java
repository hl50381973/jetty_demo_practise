package com.rest.test;

import java.io.File;
import java.io.FileNotFoundException;

public class a {
	public static void main(String[] args){
		 String jettyDistKeystore = "/src/main/java/com/rest/test/keystore";
	        String keystorePath = System.getProperty("user.dir");
	
	        System.out.print(keystorePath+jettyDistKeystore);
	        
	        File keystoreFile = new File(keystorePath+jettyDistKeystore);
	        if (!keystoreFile.exists())
	        {
	            try {
					throw new FileNotFoundException(keystoreFile.getAbsolutePath());
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }

	}

}
