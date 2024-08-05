package br.com.futurodev.desapega.exception;

public class PersonAlreadyExistsException extends Exception{
    public PersonAlreadyExistsException(String email) {
        super("User with provided email already exists: " + email);
    }
}
