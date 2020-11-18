import java.util.*;

public class Create {

    String telefono;
    String nombre;


    AddressBook mapaAgenda = new AddressBook();


    ValidarStrings vString = new ValidarStrings();

    public void crearUser(){
        HashMap<String, String> agenda = mapaAgenda.getAgendaMap();
        telefono = vString.pedirString("Escribe el número de la persona: ");
        nombre = vString.pedirString("Escribe el nombre de la persona: ");
        if(!agenda.containsKey(telefono)){
            agenda.put(telefono, nombre);
            System.out.println("Se ha añadido correctamente.");
        }else{
            System.out.println("Ya existe el contacto.");
        }
    }

}
