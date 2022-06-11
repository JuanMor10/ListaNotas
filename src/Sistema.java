import java.util.ArrayList;
import java.util.List;

/**
 * @author: Juan Mora
 * @version: 06/06/2022
 */
public class Sistema {
    /**
     * Lista de usuarios
     */
    private static List<Usuario> usuarios=new ArrayList<>();

    /**
     * Metodo para agregar un usuario al sistema
     * @param usuario Usuario a agregar
     */
    public static void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

}
