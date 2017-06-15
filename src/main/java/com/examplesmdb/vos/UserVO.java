package com.examplesmdb.vos;

/**
 * 
 * @author mmendoza
 *
 */
public class UserVO {

	private String id;
	private String username;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String status;
	
	
	public UserVO(String id, String username, String email, String password, String firstName, String lastName, String status) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.status = status;
	}
	
	
	
	public UserVO(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public UserVO(){}

	public UserVO(String username, String email, String password, String firstName, String lastName, String status) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.status = status;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
