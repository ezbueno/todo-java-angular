package com.ezandro.todo.configuration;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ezandro.todo.services.DBService;

@Configuration
@Profile(value = "test")
public class TestConfig {
	
	@Autowired
	private DBService dbService;
	
	@Bean
	public boolean instanciar() throws ParseException {
		this.dbService.instanciarBaseDados();
		return true;
	}

}
