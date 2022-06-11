/**
 * @author: Juan Mora
 * @version: 06/06/2022
 */
public class Notas {
    private String nota="";

    public Notas() {
    }

    /**
     * @param nota Nota a agregar
     */
    public Notas(String nota) {
        this.nota = nota;
    }

    /**
     * @return Nota
     */
    public String getNota() {
        return nota;
    }

    /**
     * @param nota Nota a modificar
     */
    public void setNota(String nota) {
        this.nota = nota;
    }

    /**
     * @return Nota en formato string
     */
    @Override
    public String toString() {
        return getNota();
    }
}
