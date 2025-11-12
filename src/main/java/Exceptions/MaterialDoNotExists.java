package Exceptions;

public class MaterialDoNotExists extends RuntimeException {
    public MaterialDoNotExists(String message) {
        super(message);
    }
}
