package com.ekiras.exception;

/**
 * @author ekansh
 * @since 20/1/16
 */
public class BaseException extends RuntimeException {

    public BaseException(){
        super("this is base exception");
    }


    public BaseException(String message){
        super(message);
    }



}
