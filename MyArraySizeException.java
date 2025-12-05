public class MyArraySizeException extends Exception {
    String message;
    MyArraySizeException(String message) {
        this.message = message;
    }
}
