package Excepciones;

/**
 * @author: Juan Mora
 * @version: 06/06/2022
 */
public class ExceptionContacto extends Exception {
    /**
     * Constructor de la clase ExceptionContacto
     * @param message Mensaje de error
     */
    public ExceptionContacto(String message) {
        super(message);
    }

    /**
     * @return the message
     */
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}


