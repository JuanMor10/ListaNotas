import Auxiliar.Validador;
import Excepciones.ExcepcionUsuario;
import Excepciones.ExceptionContacto;

/**
 * @author : Juan Mora
 * @version : 06/06/2022
 */
public class Usuario {
    protected String nombre;
    protected String apellido;
    protected String correo;
    protected String contrasena;

    public Usuario(String nombre, String apellido, String correo, String contrasena) throws ExcepcionUsuario {
        if(Validador.validaEmail(correo)) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.correo = correo;
            this.contrasena = contrasena;
        } else {
            throw new ExcepcionUsuario("El correo no es valido");
        }
    }
    public Usuario(){}
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) throws ExcepcionUsuario {
        if(Validador.validaEmail(correo)) {
            this.correo = correo;
        } else {
            throw new ExcepcionUsuario("El correo no es valido");
        }
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
