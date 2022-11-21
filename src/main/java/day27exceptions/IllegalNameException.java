package day27exceptions;

public class IllegalNameException {

    public class illegalNameException extends RuntimeException {
        public illegalNameException(String message) {
            super(message);

        }

    }
}