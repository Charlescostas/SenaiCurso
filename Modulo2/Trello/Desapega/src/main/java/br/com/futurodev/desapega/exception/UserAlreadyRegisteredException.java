package br.com.futurodev.desapega.exception;

public class UserAlreadyRegisteredException extends Exception{
    public UserAlreadyRegisteredException(String email) {
        super("User with provided email already exists: " + email);
    }
}
