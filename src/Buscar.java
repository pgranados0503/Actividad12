import java.util.*;

public class Buscar {

    String telefono;
    String nombre;


    AddressBook mapaAgenda = new AddressBook();


    ValidarStrings vString = new ValidarStrings();


    public void buscarUser(){
        HashMap<String, String> agenda = mapaAgenda.getAgendaMap();
        telefono = vString.pedirString("Escriba el Numero a Buscar: ");
        if(agenda.containsKey(telefono)){
            System.out.println("El Contacto es: " + agenda.get(telefono));
        }else{
            System.out.println("No existe el contacto.");
        }

    }


}
