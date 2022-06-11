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

    /**
     * Constructor de la clase Usuario
     * @param nombre : nombre del usuario
     * @param apellido : apellido del usuario
     * @param correo : correo del usuario
     * @param contrasena : contraseña del usuario
     * @throws ExcepcionUsuario : si el usuario no cumple con los requisitos
     */
    public Usuario(String nombre, String apellido, String correo, String contrasena) throws ExcepcionUsuario {
        if(Validador.validaEmail(correo)) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.correo = correo;
            this.contrasena = contrasena;
            Sistema.addUsuario(this);
        } else {
            throw new ExcepcionUsuario("El correo no es valido");
        }
    }
    public Usuario(){}

    /**
     * getter de nombre
     * @return nombre : nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setter de nombre
     * @param nombre : nombre del usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getter de apellido
     * @return apellido : apellido del usuario
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * setter de apellido
     * @param apellido : apellido del usuario
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /** getter de correo
     * @return correo : correo del usuario
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * setter de correo
     * @param correo : correo del usuario
     * @throws ExcepcionUsuario : si el usuario no cumple con los requisitos
     */
    public void setCorreo(String correo) throws ExcepcionUsuario {
        if(Validador.validaEmail(correo)) {
            this.correo = correo;
        } else {
            throw new ExcepcionUsuario("El correo no es valido");
        }
    }

    /**
     * getter de contrasena
     * @return contrasena : contraseña del usuario
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * setter de contrasena
     * @param contrasena : contraseña del usuario
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * Metodo para obtener el tipo de usuario
     * @return toString de Usuario
     */
    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s",getNombre(),getApellido(),getCorreo(),getContrasena());
    }
}
