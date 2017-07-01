package com.cornerstones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.*;
import org.springframework.transaction.annotation.*;

import javax.sql.DataSource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.cornerstones.party.models.Party;
import com.cornerstones.dao.*;


@SpringBootApplication
public class CornerstonesApplication implements CommandLineRunner {

	@Autowired
	DataSource dataSource;
	
	
	
	@Autowired
	partyDAO partyDao;
	
	public static void main(String[] args) {
		SpringApplication.run(CornerstonesApplication.class, args);
	}
	
	@Transactional
	@Override
	public void run (String... args) throws Exception {
		System.out.println(dataSource);
		List<Party> parties = new ArrayList();
		parties= (List<Party>)partyDao.getParty();
		for (Party _party:parties){
			System.out.println(_party.getPartyId());
		}
		
	}
}
