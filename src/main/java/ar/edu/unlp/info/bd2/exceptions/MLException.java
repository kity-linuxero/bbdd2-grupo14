package ar.edu.unlp.info.bd2.exceptions;

public class MLException extends Exception {

	public MLException(String string) {
		super(string);
	}
	
	public MLException() {
		super("App Exception!");
	}

}
