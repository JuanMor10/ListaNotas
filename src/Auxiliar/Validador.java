package Auxiliar;

/**
 * @author : Juan Mora
 * @version : 06/06/2022
 */
public class Validador {
    /**
     * Metodo que valida que un email
     * @param email a validar
     * @return true si es valido, false en caso contrario
     */
    public static boolean validaEmail(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    /**
     * Metodo que valida que una contraseña
     * @param password a validar
     * @return true si es valido, false en caso contrario
     */
    public static boolean validaPassword(String password) {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        return password.matches(regex);
    }
}
