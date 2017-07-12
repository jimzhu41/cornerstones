package com.cornerstones.util;


import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

import org.apache.log4j.*;

import com.cornerstones.CornerstonesApplication;
 


 

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
	        
	        HashMap<String,String> propMap = new HashMap<String,String>();
			
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
			    propMap.put(key, prop.getProperty(key));
				//System.out.println(prop.getProperty(key));
			    
			}
			System.out.println(prop.getProperty("password.length.min"));
	   }
	   
	   catch (IOException ex){
		   ex.printStackTrace();
	   }
	        
	       Iterator<String> propIterator = propMap.keySet().iterator();
	       while(propIterator.hasNext()) {
	    	   System.out.println("key" + propIterator.next()+"value" + propMap.get(propIterator.next()));
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
	 
	 
	     
	   
	    /** Returns the value of the specified property name from the specified resource/properties file.
	     * If the specified property name or properties file is not found, the defaultValue is returned.
	     * @param resource The name of the resource - if the properties file is 'webevent.properties', the resource name is 'webevent'
	     * @param name The name of the property in the properties file
	     * @param defaultValue The value to return if the property is not found
	     * @return The value of the property in the properties file, or if not found then the defaultValue
	     */
	    public static String getPropertyValue(String resource, String name, String defaultValue) {
	        String value = getPropertyValue(resource, name);

	        if (ValidateUtil.isEmpty(value))
	            return defaultValue;
	        else
	            return value;
	    }

	    public static double getPropertyNumber(String resource, String name, double defaultValue) {
	        String str = getPropertyValue(resource, name);
	        if (str == null) {
	            return defaultValue;
	        }

	        try {
	            return Double.parseDouble(str);
	        } catch (NumberFormatException nfe) {
	            return defaultValue;
	        }
	    }

	    public static double getPropertyNumber(String resource, String name) {
	        return getPropertyNumber(resource, name, 0.00000);
	    }

	    /**
	     * Returns the Number as a Number-Object of the specified property name from the specified resource/properties file.
	     * If the specified property name or properties file is not found, the defaultObject is returned.
	     * @param resource The name of the resource - if the properties file is 'webevent.properties', the resource name is 'webevent'
	     * @param name The name of the property in the properties file
	     * @param defaultNumber Optional: The Number to return if the property is not found.
	     * @param type A String of the the Object the Number is converted to (like "Integer").
	     * @return A Number-Object of the property as the defined type; or if not found the defaultObject
	     */
	    private static Number getPropertyNumber(String resource, String name, Number defaultNumber, String type) {
	        String str = getPropertyValue(resource, name);
	        if (ValidateUtil.isEmpty(str)) {
	            //Debug.logWarning("Error converting String \"" + str + "\" to " + type + "; using defaultNumber " + defaultNumber + ".", module);
	            return defaultNumber;
	        } else
	            try {
	                return (Number)(ObjectType.simpleTypeConvert(str, type, null, null));
	            } catch (Exception e) {
	               // Debug.logWarning("Error converting String \"" + str + "\" to " + type + "; using defaultNumber " + defaultNumber + ".", module);
	            }
	            return defaultNumber;
	    }

	    /**
	     * Returns a Boolean-Object of the specified property name from the specified resource/properties file.
	     * If the specified property name or properties file is not found, the defaultValue is returned.
	     * @param resource The name of the resource - if the properties file is 'webevent.properties', the resource name is 'webevent'
	     * @param name The name of the property in the properties file
	     * @param defaultValue Optional: The Value to return if the property is not found or not the correct format.
	     * @return A Boolean-Object of the property; or if not found the defaultValue
	     */
	    public static Boolean getPropertyAsBoolean(String resource, String name, boolean defaultValue) {
	        String str = getPropertyValue(resource, name);
	        if ("true".equalsIgnoreCase(str)) return Boolean.TRUE;
	        else if ("false".equalsIgnoreCase(str)) return Boolean.FALSE;
	        else return defaultValue;
	    }

	    /**
	     * Returns an Integer-Object of the specified property name from the specified resource/properties file.
	     * If the specified property name or properties file is not found, the defaultNumber is returned.
	     * @param resource The name of the resource - if the properties file is 'webevent.properties', the resource name is 'webevent'
	     * @param name The name of the property in the properties file
	     * @param defaultNumber Optional: The Value to return if the property is not found.
	     * @return An Integer-Object of the property; or if not found the defaultNumber
	     */
	    public static Integer getPropertyAsInteger(String resource, String name, int defaultNumber) {
	        return (Integer)getPropertyNumber(resource, name, defaultNumber, "Integer");
	    }
		 
	 }	 
		 
	 

 
