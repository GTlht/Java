package com.exception;

public class NotEatMeetException extends RuntimeException {
	public NotEatMeetException() {}
	
	public NotEatMeetException(String message) {
		super(message);
	}
}
