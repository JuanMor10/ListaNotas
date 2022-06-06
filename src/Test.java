/**
 * @author: Juan Mora
 * @version: 06/06/2022
 */
public class Test {
    public static void main(String[] args) {
        Notas nota1= new Notas("Nota 1");
        Notas nota2= new Notas("Nota 2");
        Notas nota3= new Notas("Nota 3");
        UsuarioAnonimo.getInstance().addNotas(nota1);
        UsuarioAnonimo.getInstance().addNotas(nota2);
        UsuarioAnonimo.getInstance().addNotas(nota3);
        Usuario anom= UsuarioAnonimo.getInstance();
        System.out.println(UsuarioAnonimo.getInstance().mostrarNotas());
        ((UsuarioAnonimo) anom).modificarNotas(nota1,new Notas("Nota 1 modificada"));
        System.out.println(UsuarioAnonimo.getInstance().mostrarNotas());
    }
}


