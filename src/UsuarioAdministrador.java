import Excepciones.ExcepcionUsuario;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author: Juan Mora
 * @version: 06/06/2022
 */
public class UsuarioAdministrador extends Usuario {
    private TipoUsuario tipoUsuario=TipoUsuario.ADMINISTRADOR;
    private LocalDateTime fechaConexion;


    /**
     * Constructor de la clase UsuarioAdministrador
     *
     * @param nombre     Nombre del usuario
     * @param apellido   Apellido del usuario
     * @param correo     Correo del usuario
     * @param contrasena Contraseña del usuario
     */
    public UsuarioAdministrador(String nombre, String apellido, String correo, String contrasena) throws ExcepcionUsuario {
        super(nombre, apellido, correo, contrasena);
        this.fechaConexion = LocalDateTime.now();
        Sistema.addUsuario(this);
    }


    /**
     * Metodo que modifica el usuario recibido por parametro
     *
     * @param usuario      Usuario a modificar
     * @param nombre       Nuevo nombre del usuario
     * @param apellido     Nuevo apellido del usuario
     * @param correo       Nuevo correo del usuario
     * @param contrasena   Nueva contraseña del usuario
     * @param tipoUsuario  Nuevo tipo de usuario
     * @param usuarioNuevo Nuevo nombre de usuario
     * @return Usuario modificado
     */
    public boolean modificaUsuario(Usuario usuario, String nombre, String apellido, String correo, String contrasena, TipoUsuarioRegistrado tipoUsuario, String usuarioNuevo) {
        boolean modificado = false;
        if (usuario instanceof UsuarioRegistrado) {
            ((UsuarioRegistrado) usuario).setNombre(nombre);
            ((UsuarioRegistrado) usuario).setApellido(apellido);
            ((UsuarioRegistrado) usuario).setCorreo(correo);
            ((UsuarioRegistrado) usuario).setContrasena(contrasena);
            ((UsuarioRegistrado) usuario).setTipoUsuario(tipoUsuario);
            ((UsuarioRegistrado) usuario).setNombreUsuario(usuarioNuevo);
            modificado = true;
        }
        return modificado;
    }

    /**
     * Metodo que crea el usuario recibido por parametro
     * @param usuario Usuario a crear
     * @param tipoUsuario Tipo de usuario a crear
     * @param nombre Nombre del usuario
     * @param apellido Apellido del usuario
     * @param correo Correo del usuario
     * @param contrasena Contraseña del usuario
     * @param tipoUsuarioRegistrado Tipo de usuario a crear
     * @param NombreUsuario Nombre de usuario
     * @throws ExcepcionUsuario Si el usuario ya existe
     */
    public void creaUsuarioTipo(Usuario usuario, TipoUsuario tipoUsuario, String nombre, String apellido,
                                       String correo, String contrasena, TipoUsuarioRegistrado tipoUsuarioRegistrado, String NombreUsuario) throws ExcepcionUsuario {
        if (tipoUsuario == TipoUsuario.USUARIO_REGISTRADO) {
            usuario = new UsuarioRegistrado(nombre, apellido, correo, contrasena, tipoUsuarioRegistrado, NombreUsuario);
            Sistema.addUsuario(usuario);
        } else if (tipoUsuario == TipoUsuario.ADMINISTRADOR) {
            usuario = new UsuarioAdministrador(nombre, apellido, correo, contrasena);
            Sistema.addUsuario(usuario);
        } else {
            throw new ExcepcionUsuario("El usuario no es de tipo registrado ni administrador");
        }
    }

    /**
     * Metodo que elimina el usuario recibido por parametro
     * @param listaUsuarios Lista de usuarios
     * @param usuario Usuario a eliminar
     * @return Usuario eliminado
     */
    public boolean elimiarUsuario(List<Usuario> listaUsuarios, Usuario usuario){
        boolean elimina=false;
            if(listaUsuarios.contains(usuario)) {
                listaUsuarios.remove(usuario);
                elimina=true;
            }
        return elimina;
    }

    /**
     * Metodo que desactiva al usuario anonimo
     * @return true si desactiva al usuario anonimo
     */
    public boolean desactivaUsuarioAnonimo(){
       return UsuarioAnonimo.getInstance().desactivado();
    }

    /**
     * Metodo que desactiva al usuario registrado
     * @return true si desactiva al usuario registrado
     */
    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * Metodo que devuelve la fecha de la conexion del usuario admin
     * @return fecha de la conexion
     */
    public LocalDateTime getFechaConexion() {
        return fechaConexion;
    }

    /**
     * Metodo toString
     * @return String con los datos del usuario
     */
    @Override
    public String toString() {
        return String.format("%s %s,%s,%s,%s",getNombre(),getApellido(),getCorreo(),getContrasena(),getTipoUsuario().toString());
    }

}
