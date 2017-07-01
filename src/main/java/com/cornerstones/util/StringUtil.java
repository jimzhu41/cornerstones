
package com.cornerstones.util;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class StringUtil  {

	 private StringUtil() {};
	 
	 public static String internString(String value) {
		 return value != null ? value.intern() : null; 
	 }
	 
	 /**
	     * Replaces all occurrences of oldString in mainString with newString
	     * @param mainString The original string
	     * @param oldString The string to replace
	     * @param newString The string to insert in place of the old
	     * @return mainString with all occurrences of oldString replaced by newString
	     */
	 public static String replaceString(String mainString, String newString, String oldString ) {
		 
		 if (newString.isEmpty()) return mainString;
		 if (oldString.isEmpty()) return mainString;
		 if (mainString.isEmpty()) return null;
		 
		 int i = mainString.lastIndexOf(oldString);
		 if(i < 0) return mainString;
		 
		 StringBuilder mainsb = new StringBuilder(mainString);
		 
		 while (i > 0) {
			 mainsb.replace(i, i+oldString.length(), newString);
			 i = mainString.lastIndexOf(oldString,i-1);
			 
			 
		 }
		 return mainsb.toString();
	 }
	 
	 /**
	     * Creates a single string from a List of strings seperated by a delimiter.
	     * @param list a list of strings to join
	     * @param delim the delimiter character(s) to use. (null value will join with no delimiter)
	     * @return a String of all values in the list seperated by the delimiter
	     */
	 public static String jointString (List<String> listString, String delim) {
		 
		  if (listString == null || listString.size()<0) return null;
		  StringBuilder jointstring = new StringBuilder();
		  Iterator<String> iterator = listString.iterator();
		  
		  while (iterator.hasNext()) {
			  jointstring.append(iterator.next());
			  if (iterator.hasNext()) {
				  jointstring.append(delim);
			  }
		
		  }
		 
		 return jointstring.toString();
		 
		 
	 }
	 
	 /**
	     * Splits a String on a delimiter into a List of Strings.
	     * @param str the String to split
	     * @param delim the delimiter character(s) to join on (null will split on whitespace)
	     * @return a list of Strings
	     */
	 
	  public static  List<String> splitString(String str, String delim) {
		  List<String> splitList = null;
		  StringTokenizer st = null;
		  
		  if (str.isEmpty()) return splitList;
		  
		  if (delim !=null) { st = new StringTokenizer(str, delim);}
		  else st = new StringTokenizer(str);
		  
		  if (st!= null && st.hasMoreTokens()) {
			   splitList = new ArrayList<String>();
			   while (st.hasMoreTokens()) {
				   splitList.add(st.nextToken());
			   }
			   
			  
		  }
		  return splitList;
	  }
	  
	    /**
	     * Splits a String on a delimiter into a List of Strings.
	     * @param str the String to split
	     * @param delim the delimiter character(s) to join on (null will split on whitespace)
	     * @param limit see String.split() method
	     * @return a list of Strings
	     */
	    public static List<String> split(String str, String delim, int limit) {
	        List<String> splitList = null;
	        String[] st = null;

	        if (str == null) return splitList;

	        if (delim != null) st = Pattern.compile(delim).split(str, limit);
	        else               st = str.split("\\s");

	        
	        if (st != null && st.length > 0) {
	            splitList = new ArrayList<String>();
	            for (int i=0; i < st.length; i++) splitList.add(st[i]);
	        }
	        
	        return splitList;
	    }
	  /**
	     * Encloses each of a List of Strings in quotes.
	     * @param list List of String(s) to quote.
	     */
	  
	    public static List<String> quotaString(List<String> stringList){
	    	List<String> temList = stringList;
	    	if (stringList.size() == 0) return null;
	    	else {
	    		stringList.clear();
	    		for (String str : temList) {
	    	        str = ""+str+"";
	    			stringList.add(str);
	    		}
	    	
	    	return stringList;
	    	}
	    	
	    }
	    	/**
	         * Remove/collapse multiple characters
	         *
	         * @param str string to collapse characters in
	         * @param c character to collapse
	         * @return the converted string
	         */
	    	
	    	public static String collapseCharacter(String str , char c) {
	    		
	            StringBuilder sb = new StringBuilder();
	            char last = str.charAt(0);

	            for (int i = 0; i < str.length(); i++) {
	                char current = str.charAt(i);
	                if (i == 0 || current != c || last != c) {
	                    sb.append(current);
	                    last = current;
	                }
	            }

	            return sb.toString();
	    		 
	    	}
	    
	    	/**
	         * Remove/collapse multiple spaces
	         *
	         * @param str string to collapse spaces in
	         * @return the converted string
	         */
	        public static String collapseSpaces(String str) {
	            return collapseCharacter(str, ' ');
	        }
	    
	        /**
	         * Remove/collapse multiple newline characters
	         *
	         * @param str string to collapse newlines in
	         * @return the converted string
	         */
	        public static String collapseNewlines(String str) {
	            return collapseCharacter(str, '\n');
	        }

	        private static char[] hexChar = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
	        public static char[] encodeInt(int i, int j, char digestChars[]) {
	            if (i < 16) {
	                digestChars[j] = '0';
	            }
	            j++;
	            do {
	                digestChars[j--] = hexChar[i & 0xf];
	                i >>>= 4;
	            } while (i != 0);
	            return digestChars;
	        }
}

 
