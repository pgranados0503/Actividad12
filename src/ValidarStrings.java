import java.util.*;

public class ValidarStrings {

    private Scanner string;
    public ValidarStrings() {
        string = new Scanner(System.in);
        string.useDelimiter("\n");
        string.useLocale(Locale.US);
    }
    public String pedirString(String mensaje) {
        System.out.println(mensaje);
        String cadena = string.next();
        return cadena;
    }
}
