package com.te.pcm.procatexception;

public class NoRecordInvalidIdException extends RuntimeException{
	String message;
public NoRecordInvalidIdException(String message)  {
		
		
		
		
		
		
		
		//super(message);
		this.message = message;
	}
	public NoRecordInvalidIdException() {
	// TODO Auto-generated constructor stub
}
	public String getMessage() {
		return message;
	}

}
