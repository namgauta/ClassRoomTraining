package com.exception;

public class InvalidConnectionException extends RuntimeException{
    public InvalidConnectionException(String s){
        super(s);
    }
}
