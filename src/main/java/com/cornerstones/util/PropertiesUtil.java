package com.cornerstones.util;


import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.text.MessageFormat;
import java.util.Enumeration;
import java.util.InvalidPropertiesFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

import org.apache.log4j.*;

import com.cornerstones.*;

public class PropertiesUtil {
	
	  
		static Logger logger = Logger.getLogger(PropertiesUtil.class.getName());
		
		/** Returns the specified resource/properties file
	     * @param resource The name of the resource - can be a file, class, or URL
	     * @return The properties file
	     */
	    
	 
		public static final String model = PropertiesUtil.class.getName();
		

	    /** Compares the specified property to the compareString, returns true if they are the same, false otherwise
	     * @param resource The name of the resource - if the properties file is 'webevent.properties', the resource name is 'webevent'
	     * @param name The name of the property in the properties file
	     * @param compareString The String to compare the property value to
	     * @return True if the strings are the same, false otherwise
	     */
		
		public static boolean  propertyValueEquals(String resource, String name, String compareString) {
			String value = getPropertyValue(resource, name);
			if (value==null) return false;
			if (value.trim().equals(compareString) ) return true;
			else return false;
			
		}
		
		
		 /** Compares Ignoring Case the specified property to the compareString, returns true if they are the same, false otherwise
	     * @param resource The name of the resource - if the properties file is 'webevent.properties', the resource name is 'webevent'
	     * @param name The name of the property in the properties file
	     * @param compareString The String to compare the property value to
	     * @return True if the strings are the same, false otherwise
	     */
	    public static boolean propertyValueEqualsIgnoreCase(String resource, String name, String compareString) {
	         String value = getPropertyValue(resource, name);
	         if (value==null) return false;
	         return value.trim().equalsIgnoreCase(compareString);
	    }
	    
	    
	    
		public static String getPropertyValue(String resource, String name){
			Properties property = getProperties(resource);
			
			return property.getProperty(name);
			
		}
		public static Properties getProperties(String resource) {
	        Properties prop = new Properties();
	        InputStream input = null;
	   try {  
			if (resource == null || resource.length() <= 0) {
	            return null;
	        }
			if (!resource.contains(".properties")) resource = resource+".properties";
	      
			input = CornerstonesApplication.class.getClassLoader().getResourceAsStream(resource);
	        if (input==null){
	        	logger.debug(CornerstonesApplication.class.getClassLoader().getResourceAsStream(resource)+ "ERROR");
	        }
	        
			prop.load(input);
			
			Enumeration<?> e = prop.propertyNames();
			while (e.hasMoreElements()) {
				String key = (String) e.nextElement();
				System.out.println(prop.getProperty(key));
			//	logger.debug(prop.getProperty(key));
			}
			System.out.println(prop.getProperty("password.length.min"));
	   }
	   
	   catch (IOException ex){
		   ex.printStackTrace();
	   }
	        
	     
	        return prop;
	    }


		public static ResourceBundle getResourceBundle(String resource) {
			Locale uslocale = new Locale("en","US");
			
		    return getResourceBundle(resource,uslocale);	
		}
	 public static ResourceBundle getResourceBundle(String resource, Locale local) {
		 
		   
		  ResourceBundle label = ResourceBundle.getBundle(resource, local, CornerstonesApplication.class.getClassLoader());
	      Enumeration<?> bundleKeys = label.getKeys();
	      while (bundleKeys.hasMoreElements())
	      {
	    	  System.out.println(label.getString((String)bundleKeys.nextElement()));
	      }
		  return label;
		  }
		 
	 }	 
		 
	 

 
