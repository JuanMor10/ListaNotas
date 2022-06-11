import Excepciones.ExcepcionUsuario;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Juan Mora
 * @version : 06/06/2022
 */
public class UsuarioRegistrado extends Usuario {

    private TipoUsuarioRegistrado tipoUsuario;
    private String nombreUsuario;
    private List<Contacto> contactos=new ArrayList<>();
    private List<Notas> notas=new ArrayList<>();



    /**
     * Constructor de usuario registrado
     * @param nombre Nombre del usuario
     * @param apellido Apellido del usuario
     * @param correo Correo del usuario
     * @param contrasena Contraseña del usuario
     * @param tipoUsuario Tipo de usuario
     * @param usuario Nombre de usuario
     */
    public UsuarioRegistrado(String nombre, String apellido, String correo, String contrasena, TipoUsuarioRegistrado tipoUsuario, String usuario) throws ExcepcionUsuario {
        super(nombre, apellido, correo, contrasena);
        this.tipoUsuario= tipoUsuario;
        this.nombreUsuario= usuario;
        Sistema.addUsuario(this);
    }

    /**
     * @param nota Nota a agregar
     */
    public void addNotas(Notas nota) {
        notas.add(nota);
    }

    /**
     * @param nota Nota a eliminar
     */
    public void removeNotas(Notas nota) {
        notas.remove(nota);
    }

    /**
     * @return Lista de notas
     */
    public List<Notas> getNotas() {
        return notas;
    }

    /**
     * Metodo para modificar una nota
     * @param notaVieja Nota vieja
     * @param notaVieja Nota nueva
     */
    public void modificarNotas(Notas notaVieja,Notas notaNueva) {
        Notas nota_modifica=null;
        int pos=0;
        for (Notas nota: notas) {
            if (nota.getNota().equals(notaVieja.getNota())) {
                nota_modifica=nota;
                pos=notas.indexOf(nota);
            }
        }
        if (nota_modifica!=null) {
            notas.remove(nota_modifica);
            notas.add(pos,notaNueva);
        }
    }

    /**
     * Metodo para mostrar las notas
     * @return Notas
     */
    public String mostrarNotas() {
        StringBuilder notas_string= new StringBuilder();
        for (Notas nota: notas) {
            notas_string.append(nota.getNota()).append("\n");
        }
        return notas_string.toString();
    }

    /**
     * Metodo para agregar contactos
     */
    public void addContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    /**
     * Metodo para eliminar contactos
     */
    public void removeContacto(Contacto contacto) {
        contactos.remove(contacto);
    }

    /**
     * Metodo para obtener contactos
     * @return Lista de contactos
     */
    public List<Contacto> getContactos() {
        return contactos;
    }

    /**
     * Metodo para obtener el nombre
     * @return Nombre
     */
    public String mostrarContactos() {
        StringBuilder contactos_string= new StringBuilder();
        for (Contacto contacto: contactos) {
            contactos_string.append(contacto.getNombre()).append("\n");
        }
        return contactos_string.toString();
    }

    /**
     * Metodo para obtener el nombre
     * @return Nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para obtener el apellido
     * @param nombre Nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener el apellido
     * @return Apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Metodo para obtener el apellido
     * @param apellido Apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Metodo para obtener el correo
     * @return Correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Metodo para obtener el correo
     * @param correo Correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Metodo para obtener la contraseña
     * @return Contraseña
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Metodo para obtener la contraseña
     * @param contrasena Contraseña
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * Metodo para obtener el tipo de usuario
     * @return Tipo de usuario
     */
    public TipoUsuarioRegistrado getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * Metodo para obtener el tipo de usuario
     * @param tipoUsuario Tipo de usuario
     */
    public void setTipoUsuario(TipoUsuarioRegistrado tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * Metodo para obtener el nombre de usuario
     * @return Nombre de usuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Metodo para obtener el nombre de usuario
     * @param nombreUsuario Nombre de usuario
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * Metodo para modificiar la lista de contactos
     * @param contactos Lista de contactos
     */
    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    /**
     * Metodo para modificiar la lista de notas
     * @param notas Lista de notas
     */
    public void setNotas(List<Notas> notas) {
        this.notas = notas;
    }

    /**
     * ToString de la clase usuario registado
     */
    @Override
    public String toString() {
        return String.format("%s %s,%s,%s,%s,%s",getNombre(),getApellido(),getCorreo(),getContrasena(),getTipoUsuario().toString(),getNombreUsuario());
    }
}
