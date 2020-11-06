package com.iiht.evaluation.eloan.model;

public class Attributes {
	
	public static final String INS_NEW_USER = "INSERT INTO USERS (USER_NAME,DOB,GENDER,EMAIL_ID,PWD,CREATED_DT)"
			+ "VALUES (?,?,?,?,?,CURDATE());";
	public static final String INS_ROLES = "INSERT INTO ELOAN_ROLES (USER_NAME,password,role)"
			+ "VALUES (?,?,\"user\");";


}
