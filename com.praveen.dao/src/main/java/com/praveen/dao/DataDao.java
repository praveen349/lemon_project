package com.praveen.dao;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import org.mongodb.morphia.Datastore;

import com.praveen.model.PersonalDetail;
import com.praveen.mongo.ConnectionFactory;

public class DataDao {
	public static void persist(PersonalDetail personalDetail) throws NoSuchAlgorithmException, IOException { 
		
		Datastore datastore = ConnectionFactory.getInstance().getDatastore(); 
		datastore.save(personalDetail); 
	} 

}
