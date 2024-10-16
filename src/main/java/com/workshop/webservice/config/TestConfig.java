package com.workshop.webservice.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.workshop.webservice.entities.User;
import com.workshop.webservice.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Amanda", "amanda@gmail.com", "1234", "senha");
		User u2 = new User(null, "Juan", "juan@hotmail.com", "5678", "abcdef");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	
	
}
