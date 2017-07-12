package com.cornerstones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.*;
import org.springframework.transaction.annotation.*;

import javax.sql.DataSource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import com.cornerstones.models.Party;
import com.cornerstones.models.UserLogins;
import com.cornerstones.dao.*;
import com.cornerstones.util.*;


@SpringBootApplication
public class CornerstonesApplication implements CommandLineRunner {

	@Autowired
	DataSource dataSource;
	
	
	
	@Autowired
	PartyDAO partyDao;
	
	@Autowired
	UserLoginDAO userLoginsDao; 
	
	public static void main(String[] args) {
		SpringApplication.run(CornerstonesApplication.class, args);
	}
	
	@Transactional
	@Override
	public void run (String... args) throws Exception {
		//System.out.println(dataSource);
		List<Party> parties = new ArrayList();
		parties= (List<Party>)partyDao.getParty();
		for (Party _party:parties){
			System.out.println(_party.getPartyId());
		}
		
		UserLogins userLogin2 = new UserLogins();
		
		userLogin2.setUserLoginId("jimzhu@jimzhu6.info");
		userLogin2.setRequirePasswordChange('N');
		userLogin2.setCurrentPassword("jimzhu41");
		userLogin2.setPartyId("admin");
		userLogin2.setCreatedStamp(new Date());
		userLogin2.setLastUpdatedStamp(new Date());
		
		//userLoginsDao.addUserLogins(userLogin2);
		List<UserLogins>userLogins = new ArrayList();
		userLogins = userLoginsDao.getUserLogins();
		
		for (UserLogins userLogin : userLogins){
			
			System.out.println(userLogin.getUserLoginId());
		}
		
		System.out.println(userLoginsDao.userLoginsExist("admin"));
		
		PropertiesUtil.getProperties("security");
		
	}
}
