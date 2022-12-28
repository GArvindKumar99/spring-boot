package com.te.pcm.procatexception;

public class NoRecordFoundException extends RuntimeException{
	String message;
public NoRecordFoundException(String message)  {
		
		
		
		
		
		
		
		//super(message);
		this.message = message;
	}
	public NoRecordFoundException() {
	// TODO Auto-generated constructor stub
}
	public String getMessage() {
		return message;
	}

}
