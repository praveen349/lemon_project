package com.praveen.config;

import java.util.HashSet;
import java.util.Set;

public class Config {
	
	public static boolean replication = true;
	public static Set<String> MONGOHOST = new HashSet<String>();
	public static int port = 27017;
	public static String DB_NAME = "praveen";
	public static int cph = 500;

}
