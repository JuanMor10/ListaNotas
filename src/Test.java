import Excepciones.ExcepcionUsuario;

import java.time.LocalDate;

/**
 * @author: Juan Mora
 * @version: 06/06/2022
 */
public class Test {
    public static void main(String[] args) {
        Notas nota1 = new Notas("Nota 1");
        Notas nota2 = new Notas("Nota 2");
        Notas nota3 = new Notas("Nota 3");
        UsuarioAnonimo.getInstance().addNotas(nota1);
        UsuarioAnonimo.getInstance().addNotas(nota2);
        UsuarioAnonimo.getInstance().addNotas(nota3);
        Usuario anom = UsuarioAnonimo.getInstance();
        System.out.println(UsuarioAnonimo.getInstance().mostrarNotas());
        ((UsuarioAnonimo) anom).modificarNotas(nota1, new Notas("Nota 1 modificada"));
        System.out.println(UsuarioAnonimo.getInstance().mostrarNotas());

        UsuarioRegistrado usuario = null;
        try {
            usuario = new UsuarioRegistrado("Juan", "Mora", "jmc@red.ujaen.es", "1234", TipoUsuarioRegistrado.apodo, "juan");
        } catch (ExcepcionUsuario e) {
            throw new RuntimeException(e);
        }
        usuario.addNotas(nota1);
        usuario.addNotas(nota2);
        usuario.addNotas(nota3);
        System.out.println(usuario.mostrarNotas());

        usuario.modificarNotas(nota1, new Notas("Nota 1 modificada"));
        System.out.println(usuario.mostrarNotas());

        UsuarioAdministrador admin = null;
        try {
            admin = new UsuarioAdministrador("Alberto", "Martinez", "amarti@gmail.com", "1234");
        } catch (ExcepcionUsuario e) {
            throw new RuntimeException(e);
        }

        System.out.println(admin.modificaUsuario(usuario, "Joel", "Tortosa", "jtortosa@gmail.com", "1234",
                TipoUsuarioRegistrado.apodo, "Joelcio"));

        System.out.println(usuario.getNombre());
    }
}

