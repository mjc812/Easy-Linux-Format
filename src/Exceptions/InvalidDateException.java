package Exceptions;

public class InvalidDateException extends Exception {
    public InvalidDateException(String errorMessage) {
        super(errorMessage);
    }
}
