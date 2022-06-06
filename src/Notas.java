/**
 * @author: Juan Mora
 * @version: 06/06/2022
 */
public class Notas {
    private String nota="";

    public Notas() {
    }

    public Notas(String nota) {
        this.nota = nota;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return getNota();
    }
}
