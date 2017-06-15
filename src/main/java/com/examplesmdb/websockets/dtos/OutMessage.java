package com.examplesmdb.websockets.dtos;

public class OutMessage {

	
	private String message;
	private String userId;
	private String ipmo;
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getIpmo() {
		return ipmo;
	}
	public void setIpmo(String ipmo) {
		this.ipmo = ipmo;
	}
	
	
}
