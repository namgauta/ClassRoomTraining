package com.exception;

public class InvalidDayCountException extends RuntimeException{
    public InvalidDayCountException(String s){
        super(s);
    }
}
