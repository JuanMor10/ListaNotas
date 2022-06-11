import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Juan Mora
 * @version: 06/06/2022
 */
public class UsuarioAnonimo extends Usuario {
    private final String nombre="Anonimo";
    private List<Notas> notas=new ArrayList<>();

    private static UsuarioAnonimo instace=null;

    /**
     * Metodo para desactivar
     * @return true si está desactivado
     */
    public boolean desactivado(){
        boolean desactivado=false;
        if(instace != null){
            instace = null;
            desactivado=true;
        }
        return desactivado;
    }

    /**
     * Metodo para activar el usuario anonimo
     * @return true si activa el usuario anonimo
     */
    public boolean activado(){
        boolean activado=false;
        if(instace == null){
            getInstance();
            activado=true;
        }
        return activado;
    }

    private UsuarioAnonimo () {
    }

    /**
     * Metodo para instanciar al usuario con el metodo singleton
     * @return usuario anonimo unico
     */
    public static UsuarioAnonimo getInstance() {
        if (instace == null) {
            instace = new UsuarioAnonimo();
        }
        return instace;
    }

    /**
     * Metodo para añadir notas del usuario anonimo
     * @param nota nota a añadir
     */
    public void addNotas(Notas nota) {
        notas.add(nota);
    }

    /**
     * Metodo para borrar notas de la lista
     * @param nota nota a borrar
     */
    public void removeNotas(Notas nota) {
        notas.remove(nota);
    }

    /**
     * Getter de nottas
     * @return notas
     */
    public List<Notas> getNotas() {
        return notas;
    }

    /**
     * Metodo para modificar una nota
     * @param notaVieja nota a cambiar
     * @param notaNueva nueva nota
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
     * @return notas
     */
    public String mostrarNotas() {
        StringBuilder notas_string= new StringBuilder();
        for (Notas nota: notas) {
            notas_string.append(nota.getNota()).append("\n");
        }
        return notas_string.toString();
    }
}
