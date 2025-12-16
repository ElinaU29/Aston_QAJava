public class NegativeNumberException extends RuntimeException{
    String message;
    
    NegativeNumberException(String message) {
        super(message);
    }
}
