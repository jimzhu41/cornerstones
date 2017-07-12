package com.cornerstones.security.services;


import com.cornerstones.util.PropertiesUtil;
import com.cornerstones.util.ValidateUtil;
import com.cornerstones.security.crypto.HashCrypt;

public class LoginService {

	
	
	public static boolean checkPassword(String oldPassword,boolean useEncrption, String currentPassword)
	{
		boolean passwordMatched=false;
		String hashType  = getHashType();
		if (useEncrption) {
			passwordMatched=HashCrypt.comparePassword(oldPassword,hashType, currentPassword);
			
		}
		else {
			if (oldPassword.equals(currentPassword) ){
				passwordMatched=true;
			}
		}
		
		return passwordMatched;
		
	}
	
	
	public static String getHashType() {
        String hashType = PropertiesUtil.getPropertyValue("security",  "password.encrypt.hash.type");
        if (ValidateUtil.isEmpty(hashType)) {
        	return "SHA";
        }
		return hashType;
	}
	
	
}
