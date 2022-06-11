package Excepciones;

/**
 * @author: Juan Mora
 * @version: 06/06/2022
 */
public class ExcepcionUsuario extends Exception {
    /**
     * Constructor de la clase ExcepcionUsuario
     * @param message Mensaje de error
     */
    public ExcepcionUsuario(String message) {
        super(message);
    }

    /** Metodo que devuelve el mensaje de error
     * @return the message
     */
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}


