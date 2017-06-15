package com.examplesmdb.websockets.dtos;

public class InMessage {
	
	private String message;
	private String fromUserId;
	private String ipmo;
	private String toUserId;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getIpmo() {
		return ipmo;
	}
	public void setIpmo(String ipmo) {
		this.ipmo = ipmo;
	}
	public String getFromUserId() {
		return fromUserId;
	}
	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}
	public String getToUserId() {
		return toUserId;
	}
	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}
	
	
}
