package com.examplesmdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.examplesmdb.dtos.UserDTO;
import com.examplesmdb.repositories.UserRepository;
import com.examplesmdb.repositories.impl.UserRepositoryImpl;

@SpringBootApplication
public class ExampleSmdbApplication implements CommandLineRunner {
	
	@Autowired
	private UserRepositoryImpl userRepository;	
	@Autowired
	private UserRepository userRepository1;
	 	 
	public static void main(String[] args) {
		SpringApplication.run(ExampleSmdbApplication.class, args);
	}	
	
	@Override
	public void run(String... args) throws Exception {	
		
		for (UserDTO user : userRepository1.findAll()) {
			System.out.println(user.getUsername() + "-" + user.getEmail() + "-" + user.getPassword());
		}
		System.out.println();	
		
		
		UserDTO userl = userRepository.findUserForLogin("usern1",null, "usernp1");
		if(userl != null){
			System.out.println(userl.getUsername() + "-" + userl.getEmail() + "-" + userl.getPassword());
		}	
		
	}
}
