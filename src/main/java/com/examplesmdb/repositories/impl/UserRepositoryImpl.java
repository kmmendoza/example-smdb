package com.examplesmdb.repositories.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.examplesmdb.dtos.UserDTO;

@Repository
public class UserRepositoryImpl {

	@Autowired
	MongoTemplate mongoTemplate;

	/**
	 * Find users by email and status
	 * 
	 * @param email
	 * @param status
	 * @return
	 * @throws Exception
	 */
	public List<UserDTO> findUsersByEmailAndStatus(String email, String status) throws Exception {
		List<UserDTO> users = null;

		try {
			users = new ArrayList<UserDTO>();

			Query q = new Query();

			if (email != null) {
				q.addCriteria(Criteria.where("email").regex(email + "$"));
			}
			if (status != null) {
				q.addCriteria(Criteria.where("status").is(status));
			}
			users = mongoTemplate.find(q, UserDTO.class);

		} catch (Exception e) {
			throw new Exception("Error trying to get user by email and status: " + e.getMessage());
		}

		return users;
	}

	/**
	 * Looks user for login
	 * 
	 * @return
	 * @throws Exception
	 */
	public UserDTO findUserForLogin(String username, String email, String password) throws Exception {

		UserDTO user = null;

		try {

			Query q = new Query();

			if (username != null) {
				q.addCriteria(Criteria.where("username").is(username));

			}
			if (email != null) {
				q.addCriteria(Criteria.where("email").is(email));
			}

			q.addCriteria(Criteria.where("password").is(password));

			user = mongoTemplate.findOne(q, UserDTO.class);

		} catch (Exception e) {
			throw new Exception("Error trying to get user for loggin: " + e.getMessage());
		}
		return user;
	}

	/**
	 * 
	 * @param id
	 * @param status
	 * @throws Exception
	 */
	public void updateUserStatus(String id, Integer status) throws Exception {

		try {

			Query q = new Query();
			q.addCriteria(Criteria.where("id").is(id));
			UserDTO user = mongoTemplate.findOne(q, UserDTO.class);
			user.setStatus(status.equals(0) ? "offline" : "online");
			mongoTemplate.save(user);

		} catch (Exception e) {
			throw new Exception("Error trying to set status to user: " + e.getMessage());
		}
	}

}
