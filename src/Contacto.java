import Auxiliar.Validador;
import Excepciones.ExceptionContacto;

/**
 *
 */
public class Contacto {
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private String telefono;
    private String comentario="";

    /** Construcctor de la clase Contacto
     * @param nombre Nombre del contacto
     * @param apellido Apellido del contacto
     * @param email Email del contacto
     * @param direccion Direccion del contacto
     * @param telefono Telefono del contacto
     * @throws ExceptionContacto Si el email no es valido
     */
    public Contacto(String nombre, String apellido, String email, String direccion, String telefono) throws ExceptionContacto {
        if(Validador.validaEmail(email)) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.email = email;
            this.direccion = direccion;
            this.telefono = telefono;
        } else {
            throw new ExceptionContacto("El email no es valido");
        }
    }

    /**
     * Constructor vacio de contacto
     */
    public Contacto() {
    }

    /**
     * @return  nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre nombre a setear
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return  apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido apellido a setear
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return  email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email email a setear
     */
    public void setEmail(String email) {
        if(Validador.validaEmail(email)) {
            this.email = email;
        } else {
            System.out.println("El email no es valido");
        }
    }

    /**
     * @return  direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion direccion a setear
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return  telefono
     */
    public String getTelefono() {
        return telefono;
    }
    /**
     * @param telefono telefono a setear
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
