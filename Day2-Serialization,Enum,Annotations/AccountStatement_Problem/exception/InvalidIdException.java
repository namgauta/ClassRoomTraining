package com.exception;

public class InvalidIdException extends  RuntimeException {
    public InvalidIdException(String s){
        super(s);
    }
}
