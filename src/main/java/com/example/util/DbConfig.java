package com.example.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DbConfig {

	@Value("${db.username}")
	private String dbUname;

	public String getDbUname() {
		return dbUname;
	}
	
	
}
