/**
 * @author : Juan Mora
 * @version : 06/06/2022
 */
public class UsuarioRegistrado {
   private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;
    private TipoUsuarioRegistrado tipoUsuario;
    private String nombreUsuario;


    public UsuarioRegistrado(String nombre, String apellido, String correo, String contrasena, TipoUsuarioRegistrado tipoUsuario, String usuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.tipoUsuario = tipoUsuario;
        this.nombreUsuario = usuario;
    }

}
