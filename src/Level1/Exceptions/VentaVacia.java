package Level1.Exceptions;

public class VentaVacia extends RuntimeException {
    public VentaVacia(String message) {
        super(message);
    }
}
