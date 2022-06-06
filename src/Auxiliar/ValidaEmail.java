package Auxiliar;

/**
 * @author : Juan Mora
 * @version : 06/06/2022
 */
public class ValidaEmail {
    public static boolean validaEmail(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }
}
