import java.util.*;

public class Delete {

    String telefono;
    String nombre;

    AddressBook hashmap = new AddressBook();

    ValidarStrings vString = new ValidarStrings();


    public void borrarUser(){
        HashMap<String, String> agenda = hashmap.getAgendaMap();
        telefono = vString.pedirString("Escribe el número de la persona: ");

        if(agenda.containsKey(telefono)){
            System.out.println("El contacto ha sido removido exitosamente.");
            agenda.remove(telefono);
        }else{
            System.out.println("No existe el contacto.");
        }
    }
}
