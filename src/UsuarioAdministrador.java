import Excepciones.ExcepcionUsuario;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author: Juan Mora
 * @version: 06/06/2022
 */
public class UsuarioAdministrador extends Usuario {
    private LocalDateTime fechaConexion;


    /**
     * Constructor de la clase UsuarioAdministrador
     * @param nombre Nombre del usuario
     * @param apellido Apellido del usuario
     * @param correo Correo del usuario
     * @param contrasena Contraseña del usuario
     */
    public UsuarioAdministrador(String nombre, String apellido, String correo, String contrasena) throws ExcepcionUsuario {
        super(nombre, apellido, correo, contrasena);
        this.fechaConexion = LocalDateTime.now();
    }


    /**
     * Metodo que modifica el usuario recibido por parametro
     * @param usuario Usuario a modificar
     * @param nombre Nuevo nombre del usuario
     * @param apellido Nuevo apellido del usuario
     * @param correo Nuevo correo del usuario
     * @param contrasena Nueva contraseña del usuario
     * @param tipoUsuario Nuevo tipo de usuario
     * @param usuarioNuevo Nuevo nombre de usuario
     * @return Usuario modificado
     */
    public boolean modificaUsuario(Usuario usuario, String nombre, String apellido, String correo, String contrasena,TipoUsuarioRegistrado tipoUsuario, String usuarioNuevo) {
        boolean modificado=false;
        if(usuario instanceof  UsuarioRegistrado) {
            ((UsuarioRegistrado)usuario).setNombre(nombre);
            ((UsuarioRegistrado)usuario).setApellido(apellido);
            ((UsuarioRegistrado)usuario).setCorreo(correo);
            ((UsuarioRegistrado)usuario).setContrasena(contrasena);
            ((UsuarioRegistrado)usuario).setTipoUsuario(tipoUsuario);
            ((UsuarioRegistrado)usuario).setNombreUsuario(usuarioNuevo);
            modificado=true;
        }
        return modificado;
    }
    public void createNewUserRegistred(Usuario usuario,String nombre, String apellido, String correo, String contrasena,TipoUsuarioRegistrado tipoUsuarioRegistrado, String NombreUsuario ) throws ExcepcionUsuario {
        if(usuario instanceof UsuarioRegistrado) {
            usuario=new UsuarioRegistrado(nombre,apellido,correo,contrasena,tipoUsuarioRegistrado,NombreUsuario);
        }else
            if (usuario instanceof UsuarioAdministrador) {
                usuario=new UsuarioAdministrador(nombre,apellido,correo,contrasena);
            } else {
                throw new ExcepcionUsuario("El usuario no es de tipo registrado ni administrador");
            }
    }
}
