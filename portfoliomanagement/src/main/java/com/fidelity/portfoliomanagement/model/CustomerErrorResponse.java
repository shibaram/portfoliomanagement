package com.fidelity.portfoliomanagement.model;

public class CustomerErrorResponse {
	private int status;
	private String errorMessage;
	private long timeStamp;
	
	public CustomerErrorResponse() {
		
	}
	
	public CustomerErrorResponse(int status, String errorMessage, long timeStamp) {
		super();
		this.status = status;
		this.errorMessage = errorMessage;
		this.timeStamp = timeStamp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
}
