package model.exceptions;

public class DomainException extends Exception {

	public DomainException (String msg) { //permitir que eu possa instanciar a minha classe passando uma msg pra ela
		super(msg);
	}
	
}
