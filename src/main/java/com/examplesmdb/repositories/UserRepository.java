package com.examplesmdb.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.examplesmdb.dtos.UserDTO;

public interface UserRepository extends MongoRepository<UserDTO, Serializable>{

	
	public List<UserDTO> findByLastName();
}
