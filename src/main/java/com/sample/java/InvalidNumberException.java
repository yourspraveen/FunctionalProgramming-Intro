package com.sample.java;


public class InvalidNumberException extends Exception {
    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public InvalidNumberException(String mesg) {
        this.message = mesg;
    }

    private String message;

}
