package com.erenalikoca._2_week;

public class _14_2_SpecialException extends Exception{

    // public class _14_2_SpecialException extends Exception
// public class _14_2_SpecialException extends RuntimeException

    //const
    public _14_2_SpecialException(String message){
        super(message);
    }

    public static void main(String[] args) throws _14_2_SpecialException{

        throw new _14_2_SpecialException(("Özel exception"));
    }
}
