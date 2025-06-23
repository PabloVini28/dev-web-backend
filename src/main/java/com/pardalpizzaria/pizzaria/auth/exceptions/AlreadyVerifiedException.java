package com.pardalpizzaria.pizzaria.auth.exceptions;

public class AlreadyVerifiedException extends RuntimeException {

    public AlreadyVerifiedException(String message) {
        super(message);
    }

    public AlreadyVerifiedException() {
        super("Usuário já verificado!");
    }

}
