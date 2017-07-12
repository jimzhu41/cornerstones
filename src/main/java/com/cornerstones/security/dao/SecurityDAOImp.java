package com.cornerstones.security.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import com.cornerstones.security.models.UserLoginPasswordHistory;
import com.cornerstones.security.services.*;
import com.cornerstones.util.*;


public class SecurityDAOImp implements SecurityDAO {

	@PersistenceContext
	EntityManager entitymanager;
	

	@Autowired
	LoginService loginService;
	@Override
	public boolean userLoginPasswordHistoryExit(String userLogin,String currentPassword) {
	
		int passwordHistLimit = 0;

		boolean pwdHistMatched = false;
		
	    String pwdHistLimit=PropertiesUtil.getPropertyValue("security", "password.change.history.limit");
				
		String sqlQuery ="From UserLoginPasswordHistory where userLogin=? order by fromDate desc limit " + pwdHistLimit;
		List<UserLoginPasswordHistory>pwdHistorys = new ArrayList();
	    boolean useEncrption=true;
	  
		pwdHistorys = entitymanager.createQuery(sqlQuery).setParameter(1, userLogin).getResultList();
		if (pwdHistorys.size()>0) {
		for (UserLoginPasswordHistory userLoginPwdHist: pwdHistorys) {
            if ( loginService.checkPassword(userLoginPwdHist.getCurrentPassword(), useEncrption, currentPassword))
            {
            	pwdHistMatched = true;
            	break;
            }
		
	}
		}
		return pwdHistMatched;
	}

}
