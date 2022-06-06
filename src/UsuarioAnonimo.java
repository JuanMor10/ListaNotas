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

    private UsuarioAnonimo () {
    }
    public static UsuarioAnonimo getInstance() {
        if (instace == null) {
            instace = new UsuarioAnonimo();
        }
        return instace;
    }
    public void addNotas(Notas nota) {
        notas.add(nota);
    }
    public void removeNotas(Notas nota) {
        notas.remove(nota);
    }
    public List<Notas> getNotas() {
        return notas;
    }

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

    public String mostrarNotas() {
        StringBuilder notas_string= new StringBuilder();
        for (Notas nota: notas) {
            notas_string.append(nota.getNota()).append("\n");
        }
        return notas_string.toString();
    }
}
