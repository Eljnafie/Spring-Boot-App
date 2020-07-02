package com.brightcoding.app.ws.responses;

public enum ErrorMessages {

	MISSING_REQUIRED_FIELD("Missing required field."),
	RECORD_ALREADY_EXISTS("Rcord already exists."),
	INTERNAL_SERVER_ERROR("Internal server errore."),
	NO_RECORD_FOUND("No record found.");
	
	private String errorMessage;

	private ErrorMessages(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
}
