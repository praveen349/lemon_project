package com.praveen.businessLogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.praveen.dao.RegistartionDaoImplementation;
import com.praveen.dao.RegistrationDao;
import com.praveen.model.PersonalDetailResponse;



@Component
public class BusinessLogic {
	
	@Autowired
	RegistartionDaoImplementation registrationDao;
	
	
	//private RegistrationDao registrationDao = new RegistartionDaoImplementation();


	
	public void savePersonalDetail(PersonalDetailResponse personalDetailResponse) {
		registrationDao.saveRegistartion(personalDetailResponse);
		
		
	}

}
