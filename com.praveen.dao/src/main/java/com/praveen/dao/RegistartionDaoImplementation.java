package com.praveen.dao;

import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.praveen.model.PersonalDetail;
import com.praveen.model.PersonalDetailResponse;

@Component
public class RegistartionDaoImplementation implements RegistrationDao {
	
	Gson gson = new Gson();

	
	public void saveRegistartion(PersonalDetailResponse personalDetail1) {
		
		try {
		PersonalDetail personalDetail  = new PersonalDetail();
		personalDetail.setEmail(personalDetail1.getEmail());
		personalDetail.setName(personalDetail1.getName());
		personalDetail.setPassword(personalDetail1.getPassword());
		DataDao.persist(personalDetail);
		} catch (Exception e) {
			
		}
		

	}

}
