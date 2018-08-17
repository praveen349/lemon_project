package com.praveen.dao;

import org.springframework.stereotype.Component;

import com.praveen.model.PersonalDetailResponse;


@Component
public interface RegistrationDao  {
	
	public  void saveRegistartion(PersonalDetailResponse personalDetail) ;
	

}
